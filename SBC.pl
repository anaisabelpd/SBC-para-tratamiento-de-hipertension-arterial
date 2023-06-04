% Clasificacion de la PA
% PAS presion arterial sistolica
% PAD presion arterial diastolica

categoria(PAS,PAD,"Hipertensión sistólica aislada"):-
  PAS>=140,PAD<90,!.
categoria(PAS,PAD,"Normal"):-
  PAS<120,!;
  PAD<80,!.
categoria(PAS,PAD,"Prehipertensión"):-
  PAS<140,!;
  PAD<90,!.
categoria(PAS,PAD,"Grado I"):-
  PAS<160,!;
  PAD<100,!.
categoria(PAS,PAD,"Grado II"):-
  PAS<180,!;
  PAD<110,!.
categoria(_,_,"Grado III").


% FAC factores de riesgo cardiovasculares
% LOD lesion en organo diana
% DM diabetis mellitus
% RCV riesgo cardiovascular

% Reglas para la estratificacion del RCV
rcv(Lista_FRC,LOD,DM,Categoria,Riesgo):-
  length(Lista_FRC,Y),
  (
   Y=0,LOD=false,DM=false,
   (
    Categoria="Grado I",Riesgo="Riesgo bajo",!;
    Categoria="Grado II",Riesgo="Riesgo moderado",!;
    Categoria="Grado III",Riesgo="Riesgo alto",!
   );
   Y<3,LOD=false,DM=false,
   (
    Categoria="Prehipertensión",Riesgo="Riesgo bajo",!;
    (Categoria="Grado I";Categoria="Grado II"),Riesgo="Riesgo moderado",!;
    Categoria="Grado III",Riesgo="Riesgo alto",!
   );
   (Y>=3;LOD=true;DM=true),
   (
    Categoria="Prehipertensión",Riesgo="Moderado";
    (Categoria="Grado I";Categoria="Grado II";Categoria="Grado III"),Riesgo="Riesgo alto"
   )
  ).

% Tipos de estrategias terapeuticas
estrategia(1,"Sugerir cambios en el estilo de vida. No intervenir sobre la PA.").
estrategia(2,"Cambios en el estilo de vida. No intervenir sobre la PA.").
estrategia(3,"Cambios en el estilo de vida. No intervenir sobre la PA. Considerar trataemiento de LOD.").
estrategia(4,"Cambios en el estilo de vida durante varios meses, si no control agnadir tratamiento para PA con un objetivo de <140/90.").
estrategia(5,"Cambios en el estilo de vida durante varias semanas, si no control agnadir tratamiento para PA con un objetivo de <140/90.").
estrategia(6,"Cambios en el estilo de vida. Tratamiento inmediato para la PA con un objetivo de <140/90. Tratamiento de FRC.").

% Propuesta de estrategia terapeutica segun riesgo cardiovascular
propuesta_estrategia_terapetica(Lista_FRC,LOD,DM,Categoria,Estrategia):-
  length(Lista_FRC,Y),Y=0,LOD=false, DM=false,
  (Categoria="prehipertension",estrategia(1,Estrategia),!;
   Categoria="grado I",estrategia(4,Estrategia),!;
   Categoria="grado II",estrategia(5,Estrategia),!;
   Categoria="grado III",estrategia(6,Estrategia),!)
   ;
   length(Lista_FRC,Y),Y<3,LOD=false, DM=false,
  (Categoria="prehipertension",estrategia(2,Estrategia),!;
   Categoria="grado I",estrategia(5,Estrategia),!;
   Categoria="grado II",estrategia(5,Estrategia),!;
   Categoria="grado III",estrategia(6,Estrategia),!)
   ;
   length(Lista_FRC,Y),(Y>=3;LOD=true; DM=true),
  (Categoria="prehipertension",estrategia(3,Estrategia);
   Categoria="grado I",estrategia(6,Estrategia);
   Categoria="grado II",estrategia(6,Estrategia);
   Categoria="grado III",estrategia(6,Estrategia))
   .

