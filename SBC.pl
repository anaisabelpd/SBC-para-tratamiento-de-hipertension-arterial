% Clasificacion de la PA
% PAS presion arterial sistolica
% PAD presion arterial diastolica
categoria(PAS,PAD,normal):-
  PAS<120,
  PAD<80.
categoria(PAS,PAD,prehipertension):-
  PAS>=120,
  PAS<140,
  PAD>=80,
  PAD<90.
categoria(PAS,PAD,grado_I):-
  PAS>=140,
  PAS<160,
  PAD>=90,
  PAD<100.
categoria(PAS,PAD,grado_II):-
  PAS>=160,
  PAS<180,
  PAD>=100,
  PAD<110.
categoria(PAS,PAD,grado_III):-
  PAS>=180,
  PAD>=110.
categoria(PAS,PAD,hipertension_sistolica_aislada):-
  PAS>=140,
  PAD<90.
