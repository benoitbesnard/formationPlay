// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/bbesnard/formationPlay/test2/conf/routes
// @DATE:Wed Oct 10 08:49:31 CEST 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHelloworldController HelloworldController = new controllers.ReverseHelloworldController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHelloworldController HelloworldController = new controllers.javascript.ReverseHelloworldController(RoutesPrefix.byNamePrefix());
  }

}
