% Clasificacion de la PA
% PAS presion arterial sistolica
% PAD presion arterial diastolica

categoria(PAS,PAD,"Hipertensi�n sist�lica aislada"):-
  PAS>=140,PAD<90,!.
categoria(PAS,PAD,"Normal"):-
  PAS<120,!;
  PAD<80,!.
categoria(PAS,PAD,"Prehipertensi�n"):-
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
    Categoria="Prehipertensi�n",Riesgo="Riesgo bajo",!;
    (Categoria="Grado I";Categoria="Grado II"),Riesgo="Riesgo moderado",!;
    Categoria="Grado III",Riesgo="Riesgo alto",!
   );
   (Y>=3;LOD=true;DM=true),
   (
    Categoria="Prehipertensi�n",Riesgo="Moderado";
    (Categoria="Grado I";Categoria="Grado II";Categoria="Grado III"),Riesgo="Riesgo alto"
   )
  ).

% Tipos de estrategias terapeuticas
estrategia(1,"Sugerir cambios en el estilo de vida. No intervenir sobre la PA.").
estrategia(2,"Cambios en el estilo de vida. No intervenir sobre la PA.").
estrategia(3,"Cambios en el estilo de vida. No intervenir sobre la PA. Considerar tratamiento de LOD.").
estrategia(4,"Cambios en el estilo de vida durante varios meses, si no control a�adir tratamiento para PA con un objetivo de <140/90.").
estrategia(5,"Cambios en el estilo de vida durante varias semanas, si no control a�adir tratamiento para PA con un objetivo de <140/90.").
estrategia(6,"Cambios en el estilo de vida. Tratamiento inmediato para la PA con un objetivo de <140/90. Tratamiento de FRC.").

% Propuesta de estrategia terapeutica segun riesgo cardiovascular
propuesta_estrategia_terapeutica(Lista_FRC,LOD,DM,Categoria,Estrategia):-
  length(Lista_FRC,Y),
  (
   Y=0,LOD=false, DM=false,
   (Categoria="Prehipertensi�n",estrategia(1,Estrategia),!;
    Categoria="Grado I",estrategia(4,Estrategia),!;
    Categoria="Grado II",estrategia(5,Estrategia),!;
    Categoria="Grado III",estrategia(6,Estrategia),!)
   ;
   Y<3,LOD=false, DM=false,
   (Categoria="Prehipertensi�n",estrategia(2,Estrategia),!;
    (Categoria="Grado I";Categoria="Grado II"),estrategia(5,Estrategia),!;
    Categoria="Grado III",estrategia(6,Estrategia),!)
   ;
   (Y>=3;LOD=true; DM=true),
   (Categoria="Prehipertensi�n",estrategia(3,Estrategia);
    (Categoria="Grado I";Categoria="Grado II";Categoria="Grado III"),estrategia(6,Estrategia)
   )
  ).

%Contraindicaciones por farmacos
%contraind_por_f(L:Lista de enfermedades a las que esta contraindicado,F: Farmaco).

contraind_por_f(['Gota'],'Diuréticos tiazídicos').
contraind_por_f(['Asma','Bloqueo AV grado 2','Bloqueo AV grado 3'],'Betabloqueadores').
contraind_por_f(['Bloqueo AV grado 2','Bloqueo AV grado 3','Bloqueo trifascicular',
                          'Disfunción del VI grave', 'Insuficiencia cardiaca'],'Antagonistas del calcio-verapamilo').
contraind_por_f(['Bloqueo AV grado 2','Bloqueo AV grado 3','Bloqueo trifascicular',
                          'Disfunción del VI grave', 'Insuficiencia cardiaca'],'Antagonistas del calcio-dialtiazem').
contraind_por_f(['Embarazo', 'Angioedema', 'Hiperpotasemia', 'Estenosis arterial renal bilateral'],'IECA').
contraind_por_f(['Embarazo', 'Hiperpotasemia', 'Estenosis arterial renal bilateral'],'ARA II').
contraind_por_f(['Insuficiencia renal aguda', 'Insuficiencia renal grave', 'Hiperpotasemia'],'Antagonistas del receptor mineralcorticoideo').


%Contraindicaciones absoltas
%contraindicacion_a(ListaDeSintomas,Farmaco) retorna verdadero(esta contraindicado)
%en caso de que alguno de los sintomas este contraindicado para el tipo de farmaco
% Ejemplo:
%?- contraind_a(['Gota','Asma','Bloqueo AV grado 2','Bloqueo AV grado 3'],F).
%F = 'Diuréticos tiazídicos' ;
%F = 'Betabloqueadores' ;
%F = 'Antagonistas del calcio-verapamilo' ;
%F = 'Antagonistas del calcio-dialtiazem' ;
%false.

contraind_a(ListaDeSintomas,F):- contraind_por_f(LCpF,F),not(disjuntos(LCpF,ListaDeSintomas)).

%Disjuncion entre conjuntos A y B
disjuntos([],_).
disjuntos([X|Ra],B):- memb(X,B),
                      !,fail;
                      disjuntos(Ra,B).
memb(_, []) :- fail.
memb(X,[X|_R]).
memb(X,[_H|C]):- memb(X,C).

contraindicaciones([],[]).
contraindicaciones([X|ListaFRC],[F|Fac]):-
 member(X,L),
 contraind_por_f(L,F),
 contraindicaciones(ListaFRC,Fac),!.
 

