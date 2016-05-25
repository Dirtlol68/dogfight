package jpu2016.dogfight.controller;


import java.io.IOException;

/**
 * Created by arno on 23/05/16.
 */
public interface IOrderPerformer {

    public void orderPerform(UserOrder userOrder) throws IOException;

}
