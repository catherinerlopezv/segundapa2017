/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.segundaconvocatoria;

/**
 *
 * @author Aracely
 */
public class ImplDoubleStack<E> implements DoubleStack<E>{
                int t=-1;
                int medida=0;
	
	public static final int CAPACITY=1000;
	private E[] data;
       int rSize;
	public boolean isEmpty() {
		return (t == -1);
	}

	
        public int redSize(){
           if(medida!=0)
               return medida;
           else{
               return medida-1;
           } 
	}
        public E redTop() {
		if(redSize()==0){
                    return null;
        }
                    return redSize();
	}

	public E redPop() {
		if(redSize()!=0)
                    return medida+1;
	}
  

	public void redPush(E e) {
		data[++t] = e;
	}
           public int blueSize(){
		return t+1;
	}
  

	public void bluePush(E e) {
		data[++t] = e;

	public E blueTop() {
		if (isEmpty()) return null;
		return data[t];
	}

	public E bluePop() {
		if (isEmpty()) return null;
		E response = data[t];
		data[t] = null;
		t--;
		return response;
	}
    

}

