package fiap.servico.loja.App.Store;

public class LojaServiceProxy implements fiap.servico.loja.App.Store.LojaService {
  private String _endpoint = null;
  private fiap.servico.loja.App.Store.LojaService lojaService = null;
  
  public LojaServiceProxy() {
    _initLojaServiceProxy();
  }
  
  public LojaServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initLojaServiceProxy();
  }
  
  private void _initLojaServiceProxy() {
    try {
      lojaService = (new fiap.servico.loja.App.Store.LojaServiceServiceLocator()).getlojaService();
      if (lojaService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)lojaService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)lojaService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (lojaService != null)
      ((javax.xml.rpc.Stub)lojaService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public fiap.servico.loja.App.Store.LojaService getLojaService() {
    if (lojaService == null)
      _initLojaServiceProxy();
    return lojaService;
  }
  
  public java.lang.String consultaCod(long cod) throws java.rmi.RemoteException{
    if (lojaService == null)
      _initLojaServiceProxy();
    return lojaService.consultaCod(cod);
  }
  
  
}