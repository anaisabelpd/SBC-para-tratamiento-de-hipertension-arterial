% Clasificacion de la PA
% PAS presion arterial sistolica
% PAD presion arterial diastolica

categoria(PAS,PAD,"Hipertensión sistólica aislada"):-
  PAS>=140,PAD<90,!.
categoria(PAS,PAD,"Grado III"):-
  PAS>=180,!;
  PAD>=110,!.
categoria(PAS,PAD,"Grado II"):-
  PAS>=160,!;
  PAD>=100,!.
categoria(PAS,PAD,"Grado I"):-
  PAS>=140,!;
  PAD>=90,!.
categoria(PAS,PAD,"Prehipertensión"):-
  PAS>=120,!;
  PAD>=80,!.
categoria(_,_,"Normal").

% FAC factores de riesgo cardiovasculares
% LOD lesion en organo diana
% DM diabetis mellitus
% RCV riesgo cardiovascular

% Reglas para la estratificacion del RCV
rcv(Lista_FRC,Categoria,Riesgo):-
  length(Lista_FRC,Y),
  (
   Y=0,
   (
    Categoria="Grado I",Riesgo="Riesgo bajo",!;
    Categoria="Grado II",Riesgo="Riesgo moderado",!;
    Categoria="Grado III",Riesgo="Riesgo alto",!
   );
   Y<3,not(member('LOD',Lista_FRC)),not(member('DM',Lista_FRC)),
   (
    Categoria="Prehipertensión",Riesgo="Riesgo bajo",!;
    (Categoria="Grado I";Categoria="Grado II"),Riesgo="Riesgo moderado",!;
    Categoria="Grado III",Riesgo="Riesgo alto",!
   );
   (
    Categoria="Prehipertensión",Riesgo="Moderado";
    (Categoria="Grado I";Categoria="Grado II";Categoria="Grado III"),Riesgo="Riesgo alto"
   )
  ).


% Tipos de estrategias terapeuticas
estrategia(1,"Sugerir cambios en el estilo de vida. No intervenir sobre la PA.").
estrategia(2,"Cambios en el estilo de vida. No intervenir sobre la PA.").
estrategia(3,"Cambios en el estilo de vida. No intervenir sobre la PA. Considerar tratamiento de LOD.").
estrategia(4,"Cambios en el estilo de vida durante varios meses, si no control añadir tratamiento para PA con un objetivo de <140/90.").
estrategia(5,"Cambios en el estilo de vida durante varias semanas, si no control añadir tratamiento para PA con un objetivo de <140/90.").
estrategia(6,"Cambios en el estilo de vida. Tratamiento inmediato para la PA con un objetivo de <140/90. Tratamiento de FRC.").

% Propuesta de estrategia terapeutica segun riesgo cardiovascular
propuesta_estrategia_terapeutica(Lista_FRC,Categoria,Estrategia):-
  length(Lista_FRC,Y),
  (
    Y=0,
    (
        Categoria="Prehipertensión",estrategia(1,Estrategia),!;
        Categoria="Grado I",estrategia(4,Estrategia),!;
        Categoria="Grado II",estrategia(5,Estrategia),!;
        Categoria="Grado III",estrategia(6,Estrategia),!
    )
    ;
    Y<3,not(member('LOD',Lista_FRC)),not(member('DM',Lista_FRC)),
    (
        Categoria="Prehipertensión",estrategia(2,Estrategia),!;
        (Categoria="Grado I";Categoria="Grado II"),estrategia(5,Estrategia),!;
        Categoria="Grado III",estrategia(6,Estrategia),!
    )
    ;
    (   Categoria="Prehipertensión",estrategia(3,Estrategia);
        (Categoria="Grado I";Categoria="Grado II";Categoria="Grado III"),estrategia(6,Estrategia)
    )
  ).

%Contraindicaciones absolutas por farmacos
%contraind_abso_por_f(L:Lista de enfermedades a las que esta contraindicado,F: Farmaco).

contraind_abso_por_f(['Gota'],'Diuréticos tiazídicos').
contraind_abso_por_f(['Asma','Bloqueo AV grado 2','Bloqueo AV grado 3'],'Betabloqueadores').
contraind_abso_por_f(['Bloqueo AV grado 2','Bloqueo AV grado 3','Bloqueo trifascicular',
                          'Disfunción del VI grave', 'Insuficiencia cardiaca'],'Antagonistas del calcio-verapamilo').
contraind_abso_por_f(['Bloqueo AV grado 2','Bloqueo AV grado 3','Bloqueo trifascicular',
                          'Disfunción del VI grave', 'Insuficiencia cardiaca'],'Antagonistas del calcio-dialtiazem').
contraind_abso_por_f(['Embarazo', 'Angioedema', 'Hiperpotasemia', 'Estenosis arterial renal bilateral'],'IECA').
contraind_abso_por_f(['Embarazo', 'Hiperpotasemia', 'Estenosis arterial renal bilateral'],'ARA II').
contraind_abso_por_f(['Insuficiencia renal aguda', 'Insuficiencia renal grave', 'Hiperpotasemia'],'Antagonistas del receptor mineralcorticoideo').


%Contraindicaciones absolutas
%contraindicacion_a(ListaDeSintomas,Farmaco) retorna verdadero(esta contraindicado)
%en caso de que alguno de los sintomas este contraindicado para el tipo de farmaco
% Ejemplo:
%?- contraind_a(['Gota','Asma','Bloqueo AV grado 2','Bloqueo AV grado 3'],F).
%F = 'Diuréticos tiazídicos' ;
%F = 'Betabloqueadores' ;
%F = 'Antagonistas del calcio-verapamilo' ;
%F = 'Antagonistas del calcio-dialtiazem' ;
%false.

contraind_a(ListaDeSintomas,F):- contraind_abso_por_f(LCpF,F),not(disjuntos(LCpF,ListaDeSintomas)).

%Disjuncion entre conjuntos A y B
disjuntos([],_).
disjuntos([X|Ra],B):- memb(X,B),
                      !,fail;
                      disjuntos(Ra,B).
memb(_, []) :- fail.
memb(X,[X|_R]).
memb(X,[_H|C]):- memb(X,C).

% Devolver las contraindicaciones en una lista
contraindicaciones_absolutas(ListaFRC,L_farm):- findall(F,(contraind_abso_por_f(LF,F),member(X,LF),member(X,ListaFRC)),L_farm).
 
% Contraindicaciones relativas por farmacos
%contraind_rela_por_f(L:Lista de enfermedades a las que esta contraindicado,F: Farmaco).
contraind_rela_por_f(['Síndrome metabólico','Intolerancia a la glucosa','Embarazo','Hiperpotasemia',
                       'Hipopotasemia','Atletas en activo'],'Diuréticos tiazídicos').
contraind_rela_por_f(['Síndrome metabólico','Intolerancia a la glucosa','Atletas en activo',
                       'EAP','EPOC','Bradicardia'],'Betabloqueadores').
contraind_rela_por_f(['Mujeres en edad fértil'],'IECA').
contraind_rela_por_f(['Mujeres en edad fértil'],'ARA II').

%Contraindicaciones relativas
contraind_r(ListaDeSintomas,F):- contraind_rela_por_f(LCpF,F),not(disjuntos(LCpF,ListaDeSintomas)).

 
 
 
 

