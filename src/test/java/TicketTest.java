
import controller.TicketController;
import model.MoneyType;
import model.MyTicket;
import model.Ticket;
import model.User;
import org.junit.Assert;
import org.junit.Test;
import utils.Constants;

import java.util.ArrayList;

public class TicketTest {

    @Test
    public void testBuyTicketWithBalanceAndPriceDifferent(){
        //arrange
        Constants.ValueTests();
        TicketController ticketController = new TicketController();
        User user = new User();

        user.setName("Lucas Beletato");
        user.setDocument("12455541");

        int uniqueCode = 1;
        double balance = 51.0;

        MyTicket expect = null;
        MyTicket actual;

        //act
        actual = ticketController.buyTicket (uniqueCode, user, balance, MoneyType.DOLAR, Constants.tickets);

        //assert
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void testBuyTicketWithUniqueCodeNonexistent(){
        //arrange
        Constants.ValueTests();
        TicketController ticketController = new TicketController();
        User user = new User();

        user.setName("Matheus Catossi");
        user.setDocument("12345623");

        int uniqueCode = 5;
        double balance = 50.0;

        MyTicket expect = null;
        MyTicket actual;

        //act
        actual = ticketController.buyTicket (uniqueCode, user, balance, MoneyType.DOLAR, Constants.tickets);

        //assert
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void testBuyTicketWithoutTickets(){
        //arrange
        Constants.tickets = new ArrayList<Ticket>();
        TicketController ticketController = new TicketController();
        User user = new User();

        user.setName("Matheus Catossi");
        user.setDocument("12345623");

        int uniqueCode = 1;
        double balance = 50.0;

        MyTicket expect = null;
        MyTicket actual;

        //act
        actual = ticketController.buyTicket (uniqueCode, user, balance, MoneyType.DOLAR, Constants.tickets);

        //assert
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void testBuyTicketWithMoneyTypeDifferent(){
        //arrange
        Constants.ValueTests();
        TicketController ticketController = new TicketController();
        User user = new User();

        user.setName("Matheus Catossi");
        user.setDocument("12345623");

        int uniqueCode = 1;
        double balance = 50.0;

        MyTicket expect = null;
        MyTicket actual;

        //act
        actual = ticketController.buyTicket (uniqueCode, user, balance, MoneyType.REAIS, Constants.tickets);

        //assert
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void testBuyTicketWithUserNull(){
        //arrange
        Constants.ValueTests();
        TicketController ticketController = new TicketController();
        User user = null;

        int uniqueCode = 1;
        double balance = 50.0;

        MyTicket expect = null;
        MyTicket actual;

        //act
        actual = ticketController.buyTicket (uniqueCode, user, balance, MoneyType.REAIS, Constants.tickets);

        //assert
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void testBuyTicketWithBalanceEqualsZero(){
        //arrange
        Constants.ValueTests();
        TicketController ticketController = new TicketController();
        User user = new User();

        user.setName("Lucas Beletato");
        user.setDocument("1213456245423");

        int uniqueCode = 1;
        double balance = 0;

        MyTicket expect = null;
        MyTicket actual;

        //act
        actual = ticketController.buyTicket (uniqueCode, user, balance, MoneyType.REAIS, Constants.tickets);

        //assert
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void testBuyTicketWithBalanceNegative(){
        //arrange
        Constants.ValueTests();
        TicketController ticketController = new TicketController();
        User user = new User();

        user.setName("Matheus Catossi");
        user.setDocument("12345623");

        int uniqueCode = 1;
        double balance = -1;

        MyTicket expect = null;
        MyTicket actual;

        //act
        actual = ticketController.buyTicket (uniqueCode, user, balance, MoneyType.REAIS, Constants.tickets);

        //assert
        Assert.assertEquals(expect,actual);
    }


    @Test
    public void testBuyTicketWithAllNull(){
        //arrange
        Constants.ValueTests();
        TicketController ticketController = new TicketController();

        MyTicket expect = null;
        MyTicket actual;

        //act
        actual = ticketController.buyTicket (0, null, 0, null, null);

        //assert
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void testBuyTicketWithMoneyTypeNull(){
        //arrange
        Constants.ValueTests();
        TicketController ticketController = new TicketController();
        User user = new User();

        user.setName("Matheus Catossi");
        user.setDocument("12345623");

        int uniqueCode = 1;
        double balance = 50;

        MyTicket expect = null;
        MyTicket actual;

        //act
        actual = ticketController.buyTicket (uniqueCode, user, balance, null, Constants.tickets);

        //assert
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void testBuyTicketWithUserDocumentNull(){
        //arrange
        Constants.ValueTests();
        TicketController ticketController = new TicketController();
        User user = new User();

        user.setName("Matheus Catossi");
        user.setDocument(null);

        int uniqueCode = 1;
        double balance = 50;

        MyTicket expect = null;
        MyTicket actual;

        //act
        actual = ticketController.buyTicket (uniqueCode, user, balance, null, Constants.tickets);

        //assert
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void testBuyTicketWithUserNameNull(){
        //arrange
        Constants.ValueTests();
        TicketController ticketController = new TicketController();
        User user = new User();

        user.setName(null);
        user.setDocument("1234223");

        int uniqueCode = 1;
        double balance = 50;

        MyTicket expect = null;
        MyTicket actual;

        //act
        actual = ticketController.buyTicket(uniqueCode, user, balance, null, Constants.tickets);

        //assert
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void testBuyTicketUniqueCode(){
        //arrange
        Constants.ValueTests();
        TicketController ticketController = new TicketController();
        User user = new User();

        user.setName("Matheus Catossi");
        user.setDocument("1234223");

        int uniqueCode = 1;
        double balance = 50;

        int expect = 1;
        MyTicket actual;

        //act
        actual = ticketController.buyTicket(uniqueCode, user, balance, MoneyType.DOLAR, Constants.tickets);

        //assert
        Assert.assertEquals(expect,actual.getTicket().getUniqueCode());
    }

    @Test
    public void testBuyTicketMoneyType(){
        //arrange
        Constants.ValueTests();
        TicketController ticketController = new TicketController();
        User user = new User();

        user.setName("Matheus Catossi");
        user.setDocument("1234223");

        int uniqueCode = 1;
        double balance = 50;

        MoneyType expect = MoneyType.DOLAR;
        MyTicket actual;

        //act
        actual = ticketController.buyTicket(uniqueCode, user, balance, MoneyType.DOLAR, Constants.tickets);

        //assert
        Assert.assertEquals(expect,actual.getTicket().getMoneyType());
    }

    @Test
    public void testBuyTicketBalance(){
        //arrange
        Constants.ValueTests();
        TicketController ticketController = new TicketController();
        User user = new User();

        user.setName("Lucas Beletato");
        user.setDocument("1212323");

        int uniqueCode = 1;
        double balance = 50.0;

        double expect = balance;
        MyTicket actual;

        //act
        actual = ticketController.buyTicket(uniqueCode, user, balance, MoneyType.DOLAR, Constants.tickets);

        //assert
        Assert.assertEquals(expect,actual.getTicket().getPrice(), 0);
    }

    @Test
    public void testBuyTicketTitle(){
        //arrange
        Constants.ValueTests();
        TicketController ticketController = new TicketController();
        User user = new User();

        user.setName("Matheus Catossi");
        user.setDocument("1234223");

        int uniqueCode = 1;
        double balance = 50.0;

        String expect = "Show do Luan Santana";
        MyTicket actual;

        //act
        actual = ticketController.buyTicket(uniqueCode, user, balance, MoneyType.DOLAR, Constants.tickets);

        //assert
        Assert.assertEquals(expect,actual.getTicket().getTitle());
    }

    @Test
    public void testBuyTicketDescription(){
        //arrange
        Constants.ValueTests();
        TicketController ticketController = new TicketController();
        User user = new User();

        user.setName("Matheus Catossi");
        user.setDocument("1234223");

        int uniqueCode = 1;
        double balance = 50.0;

        String expect = "Melhor show do ano";
        MyTicket actual;

        //act
        actual = ticketController.buyTicket(uniqueCode, user, balance, MoneyType.DOLAR, Constants.tickets);

        //assert
        Assert.assertEquals(expect,actual.getTicket().getDescription());
    }

    @Test
    public void testBuyTicketLocation(){
        //arrange
        Constants.ValueTests();
        TicketController ticketController = new TicketController();
        User user = new User();

        user.setName("Matheus Catossi");
        user.setDocument("1234223");

        int uniqueCode = 1;
        double balance = 50.0;

        String expect = "São Paulo - SP";
        MyTicket actual;

        //act
        actual = ticketController.buyTicket(uniqueCode, user, balance, MoneyType.DOLAR, Constants.tickets);

        //assert
        Assert.assertEquals(expect,actual.getTicket().getLocation());
    }

    @Test
    public void testBuyTicketUser(){
        //arrange
        Constants.ValueTests();
        TicketController ticketController = new TicketController();
        User user = new User();

        user.setName("Matheus Catossi");
        user.setDocument("1234223");

        int uniqueCode = 1;
        double balance = 50.0;

        MyTicket actual;

        //act
        actual = ticketController.buyTicket(uniqueCode, user, balance, MoneyType.DOLAR, Constants.tickets);

        //assert
        Assert.assertNotEquals(null,actual.getUser());
    }

    @Test
    public void testTicketPrice(){
        //arrange
       Ticket ticket = new Ticket();
       ticket.setPrice(10.0);

        double actual;
        double expected = 10.0;

        //act
        actual = ticket.getPrice();

        //assert
        Assert.assertEquals(expected,actual, 0);
    }

    @Test
    public void testTicketDescription(){
        //arrange
        Ticket ticket = new Ticket();
        ticket.setDescription("Show maravilhoso");

        String actual;
        String expected = "Show maravilhoso";

        //act
        actual = ticket.getDescription();

        //assert
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testTicketTitle(){
        //arrange
        Ticket ticket = new Ticket();
        ticket.setTitle("Show do Drake");

        String actual;
        String expected = "Show do Drake";

        //act
        actual = ticket.getTitle();

        //assert
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testTicketMoneyType(){
        //arrange
        Ticket ticket = new Ticket();
        ticket.setMoneyType(MoneyType.EURO);

        MoneyType actual;
        MoneyType expected = MoneyType.EURO;

        //act
        actual = ticket.getMoneyType();

        //assert
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testTicketUniqueCode(){
        //arrange
        Ticket ticket = new Ticket();
        ticket.setUniqueCode(1235);

        int actual;
        int expected = 1235;

        //act
        actual = ticket.getUniqueCode();

        //assert
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testTicketLocation(){
        //arrange
        Ticket ticket = new Ticket();
        ticket.setLocation("São Paulo");

        String actual;
        String expected = "São Paulo";

        //act
        actual = ticket.getLocation();

        //assert
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testTickeListTicketNull(){
        //arrange
        Constants.tickets = null;
        TicketController ticketController = new TicketController();
        User user = new User();

        user.setName("Matheus Catossi");
        user.setDocument("123123");

        int uniqueCode = 1;
        double balance = 50;

        MyTicket expect = null;
        MyTicket actual;

        //act
        actual = ticketController.buyTicket (uniqueCode, user, balance, null, Constants.tickets);

        //assert
        Assert.assertEquals(null,actual);
    }


}
