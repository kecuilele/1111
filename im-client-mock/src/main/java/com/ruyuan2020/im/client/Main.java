package com.ruyuan2020.im.client;

import com.ruyuan2020.im.client.mock.MockImClient;

/**
 * @author zhonghuashishan
 */
public class Main {

    public static void main(String[] args) {
        MockImClient mockImClient = new MockImClient();
        mockImClient.start();
    }
}
