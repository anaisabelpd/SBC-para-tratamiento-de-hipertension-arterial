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
  
% FAC factores de riesgo cardiovasculares
% LOD lesion en organo diana
% DM diabetis mellitus
% RCV riesgo cardiovascular

% Reglas para la estratificacion del RCV
rcv(0,no,no,grado_I,riesgo_bajo).
rcv(0,no,no,grado_II,riesgo_moderado).
rcv(0,no,no,grado_III,riesgo_alto).

rcv(1,no,no,prehipertension,riesgo_bajo).
rcv(1,no,no,grado_I,riesgo_moderado).
rcv(1,no,no,grado_II,riesgo_moderado).
rcv(1,no,no,grado_III,riesgo_alto).
rcv(2,no,no,prehipertension,riesgo_bajo).
rcv(2,no,no,grado_I,riesgo_moderado).
rcv(2,no,no,grado_II,riesgo_moderado).
rcv(2,no,no,grado_III,riesgo_alto).

rcv(FRC,LOD,DM,prehipertension,riesgo_moderado):-
  FRC>=3;
  LOD=si;
  DM=si.
rcv(FRC,LOD,DM,grado_I,riesgo_alto):-
  FRC>=3;
  LOD=si;
  DM=si.
rcv(FRC,LOD,DM,grado_II,riesgo_alto):-
  FRC>=3;
  LOD=si;
  DM=si.
rcv(FRC,LOD,DM,grado_III,riesgo_alto):-
  FRC>=3;
  LOD=si;
  DM=si.
  

% Propuesta de estrategia terapeutica segun riesgo cardiovascular
estrategia(X,Y):-
 X=1,Y="Sugerir cambios en el estilo de vida. No intervenir sobre la PA.";
 X=2,Y="Cambios en el estilo de vida. No intervenir sobre la PA.";
 X=3,Y="Cambios en el estilo de vida. No intervenir sobre la PA. Considerar trataemiento de LOD.";
 X=4,Y="Cambios en el estilo de vida durante varios meses, si no control agnadir tratamiento para PA con un objetivo de <140/90.";
 X=5,Y="Cambios en el estilo de vida durante varias semanas, si no control agnadir tratamiento para PA con un objetivo de <140/90.";
 X=6,Y="Cambios en el estilo de vida. Tratamiento inmediato para la PA con un objetivo de <140/90. Tratamiento de FRC.".
 
propuesta_estrategia_terapetica(Lista_FRC,LOD,DM,Categoria,Estrategia):-
  length(Lista_FRC,Y),Y=0,LOD=false, DM=false,
  (Categoria="prehipertension",estrategia(1,Estrategia),!;
   Categoria="grado I",estrategia(4,Estrategia),!;
   Categoria="grado II",estrategia(5,Estrategia),!;
   Categoria="grado III",estrategia(6,Estrategia),!)
   ;
   length(Lista_FRC,Y),Y<3,LOD=false, DM=false,
  (Categoria="prehipertension",estrategia(2,Estrategia);
   Categoria="grado I",estrategia(5,Estrategia);
   Categoria="grado II",estrategia(5,Estrategia);
   Categoria="grado III",estrategia(6,Estrategia))
   ;
   length(Lista_FRC,Y),(Y>=3;LOD=true; DM=true),
  (Categoria="prehipertension",estrategia(3,Estrategia);
   Categoria="grado I",estrategia(6,Estrategia);
   Categoria="grado II",estrategia(6,Estrategia);
   Categoria="grado III",estrategia(6,Estrategia))
   .

