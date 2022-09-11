

--tarea #1
 

contiene palabra frase=
    if length frase < length palabra then
        False
    else if (palabra== take (length palabra) frase) then
        True
    else
        contiene palabra (tail frase)


sub_cadenas elem frase =
    filter (contiene elem) frase


--Tarea #2
contiene2 elementos conjunto conjuntoEntero=
    
    if (elementos== []) then
        True
    else if (conjunto== []) then
        False
    else if (take 1 elementos== take 1 conjunto) then
        contiene2 (tail elementos) conjuntoEntero conjuntoEntero
    else
        contiene2 elementos (tail conjunto) conjuntoEntero

sub_conjunto elem lista =
    contiene2 elem lista lista

--Tarea #3
funcAplanar listaResp fragmento listaAplanar=

    if (length (fragmento)>0) then 
        funcAplanar (append listaResp (head fragmento)) (tail fragmento) listaAplanar
    else if ((length listaAplanar)>0) then
        funcAplanar listaResp (head listaAplanar) (tail listaAplanar)
    else 

        listaResp 

append xs a = xs ++ [a]


aplanar listaAplanar= funcAplanar [] [] listaAplanar

--Tarea #4

agregar listaResp vaciar= 
    if (length vaciar >0) then
        agregar (append listaResp (head vaciar)) (tail vaciar)
    else
        listaResp


aplanarMap listaAplanar=
    concat (map (agregar []) listaAplanar)



main :: IO ()
main = do 

    print(sub_cadenas  "hola" ["wenas hola", "adios"])

    print(sub_conjunto [2,3,4] [1,2,3,4,5,6])

    print (aplanar [[1,2,3],[4,5,6],[7,8]])

    print(aplanarMap [[1,2,3],[4,5,6],[7,8]])
