package org.academiadecodigo.bootcamp.gameproject.blocks;

import com.sun.prism.impl.FactoryResetException;
import org.academiadecodigo.bootcamp.gameproject.actions.Drawable;

/**
 * Created by Daniel Baeta on 06/10/17.
 */
public class BlockFactory {

    public Drawable createBlock(){
        throw new FactoryResetException();
    }
}
