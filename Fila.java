public class Fila {

    private static Fila instance;

    public static Fila getInstance() {
        if (instance == null){
            instance = new Fila();
        }
        return instance;
    }


    public void imprimeDocumento(){


    }

    public void removeDocumento(){


    }

    public void removeTodosDocumentos(){


    }


    private Fila(){

    }
}
