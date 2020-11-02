package com.spk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author litong
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class WisdomSpkApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(WisdomSpkApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
           "            _                _                             ___     _ __    _     \n" +
                " __ __ __  (_)     ___    __| |    ___    _ __     ___    / __|   | '_ \\  | |__  \n" +
                " \\ V  V /  | |    (_-<   / _` |   / _ \\  | '  \\   |___|   \\__ \\   | .__/  | / /  \n" +
                "  \\_/\\_/  _|_|_   /__/_  \\__,_|   \\___/  |_|_|_|  _____   |___/   |_|__   |_\\_\\  \n" +
                "_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|     |_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| \n" +
                "\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-' "
        );
    }
}