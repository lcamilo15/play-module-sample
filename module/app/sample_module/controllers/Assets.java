package sample_module.controllers;

import com.google.inject.Inject;
import play.api.mvc.Action;
import play.api.mvc.AnyContent;

/**
 * Created by lcamilo on 7/26/15.
 */
public class Assets {
    @Inject
    controllers.Assets assets;
    public Action<AnyContent> versioned(String path, controllers.Assets.Asset file) {
        return assets.versioned(path, file);
    }
}
