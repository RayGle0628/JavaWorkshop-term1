package assignments.WS4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/11/15
 * @Content:workshop
 */
class AccountTest {
    private MusicTitle musicTitle1, musicTitle2, musicTitle3;
    private AccountStandard customerRayGle;
    private AccountAdministrator xiaomin;

    @BeforeEach
    public void init() {
        musicTitle1 = new MusicTitle("ChengDu", "Zhaolei", 80);
        musicTitle2 = new MusicTitle("Outside the light years", "G.E.M", 19);
        musicTitle3 = new MusicTitle("Eliminate", "Buyi Mao", 23);

        ArrayList<MusicTitleInterface> testList = new ArrayList<>();
        testList.add(musicTitle1);
        testList.add(musicTitle2);
        testList.add(musicTitle1);

        Account testCustomer = new AccountStandard("RayGle", "Mr", "raygle" +
                "@sina.cn", "lovedudu");

        customerRayGle = new AccountStandard("RayGle", "Mr", "raygle" +
                "@sina.cn", "lovedudu");
        xiaomin = new AccountAdministrator("Xiaomin", "Mrs", "xiaomin@qq" +
                ".com",
                "rootpassword");
    }
    @Test
    public void test1() {
        String expectedTitle = "ChengDu";
        String actualTitle = musicTitle1.getTitle();
        assertEquals(expectedTitle, actualTitle, "title should be: " + actualTitle);
    }
    @Test
    public void test2() {
        String expectedArtist = "Zhaolei";
        String actualArtist = musicTitle1.getArtist();
        assertEquals(expectedArtist, actualArtist, "artist should be: " + actualArtist);
    }
    @Test
    public void test3() {
        int expectedPrice = 80;
        int actualPrice = musicTitle1.getPrice();
        assertEquals(expectedPrice, actualPrice, "artist should be: " + actualPrice);
    }
    @Test
    public void test4() {
        String expectedName = "RayGle";
        String actualName = customerRayGle.getName();
        assertEquals(expectedName, actualName, "name should be: " + actualName);
    }
    @Test
    public void test5() {
        String expectedSalutation = "Mr";
        String actualSalutation = customerRayGle.getSalutation();
        assertEquals(expectedSalutation, actualSalutation, "salutation should be: " + actualSalutation);
    }
    @Test
    public void test6() {
        String expectedEmail = "raygle@sina.cn";
        String actualEmail = customerRayGle.getEmail();
        assertEquals(expectedEmail, actualEmail, "email should be: " + actualEmail);
    }
    @Test
    public void test7() {
        int expectedBalance = 0;
        int actualBalance = customerRayGle.getBalance();
        assertEquals(expectedBalance, actualBalance, "balance should be: " + actualBalance);
    }
    @Test
    public void test8() {
        ArrayList<MusicTitle> expectedPurchaseList = new ArrayList<>();
        ArrayList<MusicTitle> actualPurchaseList = customerRayGle.getTitlesBought();
        for (int i = 0; i < actualPurchaseList.size(); i++) {
            assertEquals(expectedPurchaseList.get(i), actualPurchaseList.get(i));
        }
    }
    @Test
    public void test9() {
        int expectedFailedLoginAttempts = 0;
        int actualFailedLoginAttempts = 0;
        assertEquals(expectedFailedLoginAttempts, actualFailedLoginAttempts,
                "failed login attempts should be: " + actualFailedLoginAttempts);
    }
    @Test
    public void test10() {
        int expectedMaximalLoginAttempts = 3;
        int actualMaximalLoginAttempts = AccountStandard.MAXIMAL_LOGIN_ATTEMPTS;
        assertEquals(expectedMaximalLoginAttempts, actualMaximalLoginAttempts,
                "failed login attempts should be: " + actualMaximalLoginAttempts);
    }
    @Test
    public void test11() {
        int expectedMaximalLoginAttempts = 3;
        int actualMaximalLoginAttempts = AccountStandard.MAXIMAL_LOGIN_ATTEMPTS;
        assertEquals(expectedMaximalLoginAttempts, actualMaximalLoginAttempts,
                "failed login attempts should be: " + actualMaximalLoginAttempts);
    }
    @Test
    public void test12() {
        customerRayGle.login("lovedudu");
        assertTrue(customerRayGle.getLoggedIn());

        customerRayGle.buy(musicTitle1);
        ArrayList<MusicTitle> actualPurchaseList = customerRayGle.getTitlesBought();
        assertTrue(actualPurchaseList.isEmpty());
    }
    @Test
    public void test13() {
        customerRayGle.login("loveDudu");
        assertFalse(customerRayGle.getLoggedIn());

        assertEquals(1, customerRayGle.getFailedLoginAttempts());
        customerRayGle.buy(musicTitle1);
        ArrayList<MusicTitle> actualPurchaseList = customerRayGle.getTitlesBought();
        assertTrue(actualPurchaseList.isEmpty());
    }
    @Test
    public void test14() {
        customerRayGle.login("loveDudu");
        assertFalse(customerRayGle.getLoggedIn());

        assertEquals(1, customerRayGle.getFailedLoginAttempts());

        customerRayGle.login("loveDudu");
        assertFalse(customerRayGle.getLoggedIn());

        assertEquals(2, customerRayGle.getFailedLoginAttempts());

        customerRayGle.buy(musicTitle1);
        ArrayList<MusicTitle> actualPurchaseList =customerRayGle.getTitlesBought();
        assertTrue(actualPurchaseList.isEmpty());
    }
    @Test
    public void test15() {
        customerRayGle.login("loveDudu");
        assertFalse(customerRayGle.getLoggedIn());

        assertEquals(1, customerRayGle.getFailedLoginAttempts());

        customerRayGle.login("loveDudu");
        assertFalse(customerRayGle.getLoggedIn());

        assertEquals(2, customerRayGle.getFailedLoginAttempts());

        customerRayGle.login("lovedudu");
        assertTrue(customerRayGle.getLoggedIn());

        assertEquals(0, customerRayGle.getFailedLoginAttempts());

        customerRayGle.deposit(100);
        customerRayGle.buy(musicTitle1);

        String expectedMusicTitle = "ChengDu";
        String actualMusicTitle = customerRayGle.getTitlesBought().get(0).getTitle();
        assertEquals(expectedMusicTitle, actualMusicTitle);

        String expectedArtist = "Zhaolei";
        String actualArtist = customerRayGle.getTitlesBought().get(0).getArtist();
        assertEquals(expectedArtist, actualArtist);

        int expectedPrice = 80;
        int actualPrice = customerRayGle.getTitlesBought().get(0).getPrice();
        assertEquals(expectedPrice, actualPrice);

        int expectedBalance = 20;
        int actualBalance = customerRayGle.getBalance();
        assertEquals(expectedBalance, actualBalance);

        customerRayGle.logout();
        assertFalse(customerRayGle.getLoggedIn());

        customerRayGle.deposit(20);
        expectedBalance = 40;
        actualBalance = customerRayGle.getBalance();
        assertEquals(expectedBalance, actualBalance);

        customerRayGle.buy(musicTitle2);
        int expectedPurchaseListSize = 1; // still 1
        int actualPurchaseListSize = customerRayGle.getTitlesBought().size();

        assertEquals(expectedPurchaseListSize, actualPurchaseListSize);
    }
    @Test
    public void test16() {
        customerRayGle.login("loveDudu");
        assertFalse(customerRayGle.getLoggedIn());

        assertEquals(1, customerRayGle.getFailedLoginAttempts());

        customerRayGle.login("loveDudu");
        assertFalse(customerRayGle.getLoggedIn());

        assertEquals(2,customerRayGle.getFailedLoginAttempts());

        customerRayGle.login("loveDudu");
        assertFalse(customerRayGle.getLoggedIn());

        assertEquals(3, customerRayGle.getFailedLoginAttempts());

        xiaomin.resetAccount(customerRayGle, "seed");
        String expectedPassword = "lovedudu";
        assertTrue(customerRayGle.checkPassword(expectedPassword));

        int expectedFailedLoginAttempts = 3;
        int actualFailLoginAttempts = customerRayGle.getFailedLoginAttempts();
        assertEquals(expectedFailedLoginAttempts, actualFailLoginAttempts);
    }
    @Test
    public void test17() {
        customerRayGle.login("loveDudu");
        assertFalse(customerRayGle.getLoggedIn());

        assertEquals(1, customerRayGle.getFailedLoginAttempts());

        customerRayGle.login("loveDudu");
        assertFalse(customerRayGle.getLoggedIn());

        assertEquals(2, customerRayGle.getFailedLoginAttempts());

        customerRayGle.login("loveDudu");
        assertFalse(customerRayGle.getLoggedIn());

        assertEquals(3, customerRayGle.getFailedLoginAttempts());

        xiaomin.login("rootpasssword");
        assertFalse( xiaomin.getLoggedIn());

        xiaomin.login("rootpassword");
        assertTrue( xiaomin.getLoggedIn());

        xiaomin.addAccount(customerRayGle);
        String expectedAccountName = "RayGle";
        String actualAccountName = xiaomin.getAccounts().get(0).getName();
        assertEquals(expectedAccountName, actualAccountName);
        assertTrue(! xiaomin.getAccounts().isEmpty());

        xiaomin.resetAccount(customerRayGle, "seed");
        System.out.println( xiaomin);
        String expectedPassword = "seed";
        assertTrue(customerRayGle.checkPassword(expectedPassword));

        int expectedFailedLoginAttempts = 0;
        int actualFailLoginAttempts = customerRayGle.getFailedLoginAttempts();
        assertEquals(expectedFailedLoginAttempts, actualFailLoginAttempts);

        customerRayGle.login("seed");
        //assertTrue(customerJohn.getLoggedIn());

        customerRayGle.deposit(130);
        customerRayGle.buy(musicTitle1);
        customerRayGle.buy(musicTitle2);
        customerRayGle.buy(musicTitle3);

        int expectedPurchaseListSize = 3;
        int actualPurchaseListSize = customerRayGle.getTitlesBought().size();
        assertEquals(expectedPurchaseListSize, actualPurchaseListSize);

        String expectedTitle = "Eliminate";
        String expectedArtist = "Buyi Mao";
        int expectedPrice = 23;

        String actualTitle = customerRayGle.getTitlesBought().get(2).getTitle();
        String actualArtist = customerRayGle.getTitlesBought().get(2).getArtist();
        int actualPrice = customerRayGle.getTitlesBought().get(2).getPrice();
        assertEquals(expectedTitle, actualTitle);
        assertEquals(expectedArtist, actualArtist);
        assertEquals(expectedPrice, actualPrice);

        int expectedBalance = 8;
        int actualBalance = customerRayGle.getBalance();
        assertEquals(expectedBalance, actualBalance);
    }
    @Test
    public void test18() {
        Account deputy1 = new AccountAdministrator("Golden", "Mr", "Golden" +
                "@sysadmin.org", "dep1234");
        deputy1.login("ddep1234");
        assertFalse(deputy1.getLoggedIn());

        deputy1.login("deep1234");
        assertFalse(deputy1.getLoggedIn());

        deputy1.login("dep11234");
        assertFalse(deputy1.getLoggedIn());

        xiaomin.login("rootpassword");
        assertTrue(xiaomin.getLoggedIn());

        xiaomin.addAccount(deputy1);
        xiaomin.resetAccount(deputy1, "dep1235");

        String expectedPassword = "dep1235";
        String actualPassword = xiaomin.getAccounts().get(0).getPassword();
        assertEquals(expectedPassword, actualPassword);

        assertFalse(deputy1.getLoggedIn());
        deputy1.login("dep1235");
        assertFalse(!deputy1.getLoggedIn());

        deputy1.changePassword("dep1235", "dep1242");
        deputy1.logout();
        assertFalse(deputy1.getLoggedIn());

        deputy1.login("dep1242");
        assertTrue(deputy1.getLoggedIn());
    }
}