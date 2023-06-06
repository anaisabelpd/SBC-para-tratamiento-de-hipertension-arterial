package arterial_tension.customs;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.awt.GraphicsConfiguration;
import java.awt.Transparency;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class GraphicsUtilities {
    
    private GraphicsUtilities() {
    }

    // Returns the graphics configuration for the primary screen
    private static GraphicsConfiguration getGraphicsConfiguration() {
        return GraphicsEnvironment.getLocalGraphicsEnvironment().
                getDefaultScreenDevice().getDefaultConfiguration();
    }

    public static BufferedImage createColorModelCompatibleImage(BufferedImage image) {
        ColorModel cm = image.getColorModel();
        return new BufferedImage(cm,
                cm.createCompatibleWritableRaster(image.getWidth(),
                        image.getHeight()),
                cm.isAlphaPremultiplied(), null);
    }

    public static BufferedImage createCompatibleImage(BufferedImage image) {
        return createCompatibleImage(image, image.getWidth(), image.getHeight());
    }

    public static BufferedImage createCompatibleImage(BufferedImage image,
            int width, int heigth) {
        return getGraphicsConfiguration().createCompatibleImage(width, heigth,
                image.getTransparency());
    }

    public static BufferedImage createCompatibleImage(int width, int heigth) {
        return getGraphicsConfiguration().createCompatibleImage(width, heigth);
    }

    public static BufferedImage createCompatibleTranslucentImage(int width,
            int heigth) {
        return getGraphicsConfiguration().createCompatibleImage(width, heigth,
                Transparency.TRANSLUCENT);
    }

    public static BufferedImage loadCompatibleImage(URL resource)
            throws IOException {
        BufferedImage image = ImageIO.read(resource);
        return toCompatibleImage(image);
    }

    public static BufferedImage toCompatibleImage(BufferedImage image) {
        if (image.getColorModel().equals(
                getGraphicsConfiguration().getColorModel())) {
            return image;
        }
        BufferedImage compatibleImage
                = getGraphicsConfiguration().createCompatibleImage(
                        image.getWidth(), image.getHeight(),
                        image.getTransparency());
        Graphics g = compatibleImage.getGraphics();
        g.drawImage(image, 0, 0, null);
        g.dispose();
        return compatibleImage;
    }

    public static BufferedImage createThumbnailFast(BufferedImage image,
            int newSize) {
        float ratio;
        int width = image.getWidth();
        int heigth = image.getHeight();
        if (width > heigth) {
            if (newSize >= width) {
                throw new IllegalArgumentException("newSize must be lower than"
                        + " the image width");
            } else if (newSize <= 0) {
                throw new IllegalArgumentException("newSize must"
                        + " be greater than 0");
            }
            ratio = (float) width / (float) heigth;
            width = newSize;
            heigth = (int) (newSize / ratio);
        } else {
            if (newSize >= heigth) {
                throw new IllegalArgumentException("newSize must be lower than"
                        + " the image heigth");
            } else if (newSize <= 0) {
                throw new IllegalArgumentException("newSize must"
                        + " be greater than 0");
            }
            ratio = (float) heigth / (float) width;
            heigth = newSize;
            width = (int) (newSize / ratio);
        }
        BufferedImage temp = createCompatibleImage(image, width, heigth);
        Graphics2D g2 = temp.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(image, 0, 0, temp.getWidth(), temp.getHeight(), null);
        g2.dispose();
        return temp;
    }

    public static BufferedImage createThumbnailFast(BufferedImage image,
            int newWidth, int newheigth) {
        if (newWidth >= image.getWidth()
                || newheigth >= image.getHeight()) {
            throw new IllegalArgumentException("newWidth and newheigth cannot"
                    + " be greater than the image"
                    + " dimensions");
        } else if (newWidth <= 0 || newheigth <= 0) {
            throw new IllegalArgumentException("newWidth and newheigth must"
                    + " be greater than 0");
        }
        BufferedImage temp = createCompatibleImage(image, newWidth, newheigth);
        Graphics2D g2 = temp.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(image, 0, 0, temp.getWidth(), temp.getHeight(), null);
        g2.dispose();
        return temp;
    }

    public static BufferedImage createThumbnail(BufferedImage image,
            int newSize) {
        int width = image.getWidth();
        int heigth = image.getHeight();
        boolean isWidthGreater = width > heigth;
        if (isWidthGreater) {
            if (newSize >= width) {
                throw new IllegalArgumentException("newSize must be lower than"
                        + " the image width");
            }
        } else if (newSize >= heigth) {
            throw new IllegalArgumentException("newSize must be lower than"
                    + " the image heigth");
        }
        if (newSize <= 0) {
            throw new IllegalArgumentException("newSize must"
                    + " be greater than 0");
        }
        float ratioWH = (float) width / (float) heigth;
        float ratioHW = (float) heigth / (float) width;
        BufferedImage thumb = image;
        do {
            if (isWidthGreater) {
                width /= 2;
                if (width < newSize) {
                    width = newSize;
                }
                heigth = (int) (width / ratioWH);
            } else {
                heigth /= 2;
                if (heigth < newSize) {
                    heigth = newSize;
                }
                width = (int) (heigth / ratioHW);
            }
            BufferedImage temp = createCompatibleImage(image, width, heigth);
            Graphics2D g2 = temp.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2.drawImage(thumb, 0, 0, temp.getWidth(), temp.getHeight(), null);
            g2.dispose();
            thumb = temp;
        } while (newSize != (isWidthGreater ? width : heigth));
        return thumb;
    }

    public static BufferedImage createThumbnail(BufferedImage image,
            int newWidth, int newheigth) {
        int width = image.getWidth();
        int heigth = image.getHeight();

        if (newWidth >= width || newheigth >= heigth) {
            throw new IllegalArgumentException("newWidth and newheigth cannot"
                    + " be greater than the image"
                    + " dimensions");
        } else if (newWidth <= 0 || newheigth <= 0) {
            throw new IllegalArgumentException("newWidth and newheigth must"
                    + " be greater than 0");
        }
        BufferedImage thumb = image;
        do {
            if (width > newWidth) {
                width /= 2;
                if (width < newWidth) {
                    width = newWidth;
                }
            }
            if (heigth > newheigth) {
                heigth /= 2;
                if (heigth < newheigth) {
                    heigth = newheigth;
                }
            }
            BufferedImage temp = createCompatibleImage(image, width, heigth);
            Graphics2D g2 = temp.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2.drawImage(thumb, 0, 0, temp.getWidth(), temp.getHeight(), null);
            g2.dispose();
            thumb = temp;
        } while (width != newWidth || heigth != newheigth);
        return thumb;
    }

    public static int[] getPixels(BufferedImage img,
            int x, int y, int w, int h, int[] pixels) {
        if (w == 0 || h == 0) {
            return new int[0];
        }
        if (pixels == null) {
            pixels = new int[w * h];
        } else if (pixels.length < w * h) {
            throw new IllegalArgumentException("pixels array must have a length"
                    + " >= w*h");
        }
        int imageType = img.getType();
        if (imageType == BufferedImage.TYPE_INT_ARGB
                || imageType == BufferedImage.TYPE_INT_RGB) {
            Raster raster = img.getRaster();
            return (int[]) raster.getDataElements(x, y, w, h, pixels);
        }
        // Unmanages the image
        return img.getRGB(x, y, w, h, pixels, 0, w);
    }

    public static void setPixels(BufferedImage img,
            int x, int y, int w, int h, int[] pixels) {
        if (pixels == null || w == 0 || h == 0) {
            return;
        } else if (pixels.length < w * h) {
            throw new IllegalArgumentException("pixels array must have a length"
                    + " >= w*h");
        }

        int imageType = img.getType();
        if (imageType == BufferedImage.TYPE_INT_ARGB
                || imageType == BufferedImage.TYPE_INT_RGB) {
            WritableRaster raster = img.getRaster();
            raster.setDataElements(x, y, w, h, pixels);
        } else {
            // Unmanages the image
            img.setRGB(x, y, w, h, pixels, 0, w);
        }
    }
}
