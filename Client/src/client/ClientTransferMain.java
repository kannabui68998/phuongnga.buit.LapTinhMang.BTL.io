package client;

public class ClientTransferMain {
   public static void main(String[] args) {
        ClientTransferView view = new ClientTransferView();
       ClientTransferController clientTransferController = new ClientTransferController(view);
    }

}

