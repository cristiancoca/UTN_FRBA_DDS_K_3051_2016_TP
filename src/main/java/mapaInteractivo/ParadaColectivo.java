package mapaInteractivo;

public class ParadaColectivo extends TipoPOI {
	
		/*****Atributos*****/
		private String lineacolectivo;

		/*****para q este a menos de una cuadra tiene q estar en la misma calle*****/ 
		 /***** y a una diferencia de altura menor q 100*****/

		public void setnumerocolectivo(String numcolectivo){
			this.lineacolectivo=numcolectivo;
		}
		public String getnumerocolectivo (){
			return this.lineacolectivo;
		}
		public boolean estasCercaDe(Ubicacion unaubicacion , Ubicacion miUbicacion ){
			   String calle1=unaubicacion.getCalle();
			   String calle2=miUbicacion.getCalle();
			   int altura1= unaubicacion.getAltura();
			   int altura2=miUbicacion.getAltura();
			   
			   int difaltura = Math.abs(altura1 - altura2);
			 
				if (calle1==calle2 && difaltura < 100){
				 return true;
				 }
				 else {
					 return false;
			 
		 }
		}
		public boolean estasDisponible(){
			return true ;
		}
		public boolean esElPuntoBuscado( String textolibre){
		
			String numerolinea =  this.getnumerocolectivo();
			if (textolibre== numerolinea){
				return true;
			}else {
				return false;
			}
		}
	}






