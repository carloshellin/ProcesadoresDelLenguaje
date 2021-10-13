//Hacer que se muestre la matriz de manera recursiva hacia delante y hacia atrás

Funcion MostrarAdelante ( V,datosquehay,mostrarahora )
	Escribir V[mostrarahora]
	Si mostrarahora<>datosquehay Entonces
		MostrarAdelante(V,datosquehay,mostrarahora+1)
	Fin Si
	
Fin Funcion

Funcion MostrarAtras ( V,datosquehay,mostrarahora )
	Si mostrarahora<>datosquehay Entonces
		MostrarAtras(V,datosquehay,mostrarahora+1)
	Fin Si
	Escribir V[mostrarahora]
Fin Funcion


Algoritmo OrdenarArray
	//Inicializacion: Crear variable con Dimension
	Definir V Como Entero
	Dimension V[10]
	V[1]<-3
	V[2]<-9
	V[3]<-3
	V[4]<-4
	V[5]<-5
	V[6]<-7
	V[7]<-6
	V[8]<-9
	v[9]<-8
	v[10]<-10
	
	
	//Vamos a ordenar V
	Definir contador1 Como Entero
	Definir swap Como Entero
	Definir contador2 Como Entero
	Para contador2<-1 hasta 9 con paso 1 Hacer
		Para contador1<-1 Hasta 9 Con Paso 1 Hacer
			Si v[contador1]>v[contador1+1] Entonces
				swap <- v[contador1]
				v[contador1] <- v[contador1+1]
				V[contador1+1] <- swap
			Fin Si
		Fin Para
	FinPara
	
	//Manera 1 de recorrer en adelante
	Definir contador Como Entero
	Para contador<-1 Hasta 10 Con Paso 1 Hacer
		Escribir V[contador]
	Fin Para
	
	
	//Manera 1 de recorrer en orden inverso
	Para contador<-10 Hasta 1 Con Paso -1 Hacer
		Escribir V[contador]
	Fin Para
	
	Escribir "Probando recursividad"
	MostrarAdelante(V,10,1)
	MostrarAtras(V,10,1)
FinAlgoritmo
