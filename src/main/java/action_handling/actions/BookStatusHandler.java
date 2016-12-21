package action_handling.actions;


public class BookStatusHandler extends ActionParent {

    public static boolean activate(String barcode, String sessionId){

        String targetURL = "https://admin.bookline.hu/product/activateOldbook!activate.action";
        String urlParameters = "vonalkod=" + barcode + "&submit=aktiv%C3%A1l";

        return sendRequest(targetURL, urlParameters, sessionId);
    }

    public static boolean deactivate(String productId, String sessionId){
        String targetURL = "https://admin.bookline.hu/product/sellOldbook!sell.action?apid0=10:" + productId;
        String urlParameters = "";

        return sendRequest(targetURL, urlParameters, sessionId);
    }
}
