package com.amazonaws.emergency_get.demopickupdropget;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class PickupDrop_GetLambdaFunctionHandlerTest {

    private static Void input;

    @BeforeClass
    public static void createInput() throws IOException {
        // TODO: set up your sample input object here.
        input = null;
    }

    private Context createContext() {
        TestContext ctx = new TestContext();

        // TODO: customize your context here if needed.
        ctx.setFunctionName("Your Function Name");

        return ctx;
    }

    @Test
    public void testPickupDrop_GetLambdaFunctionHandler() {
        PickupDrop_GetLambdaFunctionHandler handler = new PickupDrop_GetLambdaFunctionHandler();
        Context ctx = createContext();

        List<ResponseRoute> output = handler.handleRequest(input, ctx);

        // TODO: validate output here if needed.
        Assert.assertEquals("Hello from Lambda!", output);
    }
}
