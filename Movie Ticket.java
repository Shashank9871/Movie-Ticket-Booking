
import java.util.Scanner; 

class ConsoleColors 
{
    static String RESET = "\u001B[0m";
	static String BLACK = "\u001B[30m";
    static String RED = "\u001B[31;1m";//"\u001B[31m";
	static String GREEN = "\u001B[32m";
    static String YELLOW = "\u001B[33m";
    static String BLUE = "\u001B[34;1m";//"\u001B[34m;1m";
    static String MAGENTA = "\u001B[35m;1m";
    static String CYAN = "\u001B[36;1m";//"\u001B[36m";
    static String WHITE = "\u001B[37m";
}

class User {
    private String username;
    private int password;
    private boolean isRegistered;

    public User() {
        this.isRegistered = false;
    }
	
    public void register(String username, int password) {
        this.username = username;
        this.password = password;
        this.isRegistered = true;
        System.out.println(ConsoleColors.YELLOW+"					Registration successful! You can now log in."+ConsoleColors.RESET);
    }

    public boolean login(String username, int password) {
        if (!this.isRegistered) {
			
            System.out.println(ConsoleColors.RED+"						User not registered."+ConsoleColors.RESET);
            return false;
        }

        else if (!this.username.equals(username) && this.password != password) 
		{
			System.out.println();
            System.out.println(ConsoleColors.RED+"					   I N V A L I D   C R E D E N T I A L S"+ConsoleColors.RESET);
			System.out.println();
            return false;
        } 
		else if (!this.username.equals(username)) 
		{
			System.out.println();
            System.out.println(ConsoleColors.RED+"					     I N C O R R E C T   U S E R N A M E"+ConsoleColors.RESET);
			System.out.println();
            return false;
        } 
		else if (this.password != password) 
		{
			System.out.println();
            System.out.println(ConsoleColors.RED+"					     I N C O R R E C T   P A S S W O R D"+ConsoleColors.RESET);
			System.out.println();
            return false;
        }
		else 
		{
			System.out.println();
            System.out.println(ConsoleColors.GREEN+ "						Login Successful. WELCOME " + username + "!" + ConsoleColors.RESET);
            return true;
        }
    }

    public boolean isRegistered() {
        return isRegistered;
    }
}

class Movie {
    private String[] movies, movies1,movies2;
    private int count, c, c2;

    public Movie() {
        movies = new String[10];
        movies1 = new String[10];
		movies2 = new String[10];
        count = 0;
        c = 0;
		c2= 0;
    }

    public void TeluguMovie(String movieName) {
        if (count < movies.length) {
            movies[count] = movieName;
            count++;
        }
    }

    public void HindiMovie(String movieName) {
        if (c < movies1.length) {
            movies1[c] = movieName;
            c++;
        }
    }
	public void EnglishMovie(String movieName) {
        if (c2< movies2.length) {
            movies2[c2] = movieName;
            c2++;
        }
    }
    public String getMovie(int index) {
        if (index >= 0 && index < count) {
            return movies[index];
        } else {
            return "Invalid movie index";
        }
    }

    public String getMovie1(int index) {
        if (index >= 0 && index < c) {
            return movies1[index];
        } else {
            return "Invalid movie index";
        }
    }
	public String getMovie2(int index) {
        if (index >= 0 && index < c) {
            return movies2[index];
        } else {
            return "Invalid movie index";
        }
    }

    public void printMovies() {
        for (int i = 0; i < count; i++) {
            System.out.println("						"+(i + 1) + ". " + movies[i]);
			System.out.println();
        }
    }

    public void printMovies1() {
        for (int i = 0; i < c; i++) {
            System.out.println("						"+(i + 1) + ". " + movies1[i]);
			System.out.println();
        }
    }
	public void printMovies2() {
        for (int i = 0; i < c2; i++) {
            System.out.println("						"+(i + 1) + ". " + movies2[i]);
			System.out.println();
        }
    }
	static Movie movie = new Movie();
	void display()
	{
					movie.TeluguMovie("Hi nanna");
                    movie.TeluguMovie("OG");
                    movie.TeluguMovie("Salaar");
                    movie.TeluguMovie("Bahubali");
                    movie.TeluguMovie("Arjun Reddy");
                    movie.TeluguMovie("RRR");
                    movie.TeluguMovie("Fidaa");
                    movie.TeluguMovie("Dear Comrade");
                    movie.TeluguMovie("Miraayi");
                    movie.TeluguMovie("Pushpa");
					
					movie.HindiMovie("M.S. Dhoni");
					movie.HindiMovie("Sanam Teri Kasam");
					movie.HindiMovie("Chichoree");
					movie.HindiMovie("Ye Jawani hei Deewani");
					movie.HindiMovie("Jab we met");
					movie.HindiMovie("Jindagi na milegi dubara");
					movie.HindiMovie("Teri Baaton mei Aisa Ulijah Jiya");
					movie.HindiMovie("Lagaan");
					movie.HindiMovie("Tiger Zinda Hai");
					movie.HindiMovie("Hera Pheri");
					
					movie.EnglishMovie("The Conjuring");
					movie.EnglishMovie("A Star Is Born");
					movie.EnglishMovie("Home Alone");
					movie.EnglishMovie("The Mask");
					movie.EnglishMovie("Avatar");
					movie.EnglishMovie("The Matrix");
					movie.EnglishMovie("A Quite Place");
					movie.EnglishMovie("The Note Book");
					movie.EnglishMovie("Inception");
					movie.EnglishMovie("Night at the Museum");
	}
}

class Ticket {
	static Ticket ticket = new Ticket();
	void Tickettype(String chosenMovie1)
	{
		System.out.println(ConsoleColors.YELLOW+"\n						  Select Ticket Type "+ConsoleColors.RESET);
						System.out.println();
						System.out.println("						   1        2	      3");
						System.out.println();
						System.out.print("						Regular   Medium      VIP ");
		System.out.println();
		System.out.print("\n						Rs.200	  Rs.300    Rs.500\n");
		System.out.println();
		System.out.print(ConsoleColors.YELLOW+"						Enter Ticket Type "+ConsoleColors.RESET);		
		int ticketType = scanner.nextInt();
		System.out.println();
		ticket.selectTicketType(ticketType);
		ticket.showTicketDetails(chosenMovie1);
	}
	static Scanner scanner = new Scanner(System.in);
	
    private int ticketType;
    private float price;
	private int no_of_ppl;
    public void selectTicketType(int ticketType) 
	{
        this.ticketType = ticketType;
        switch (ticketType) {
            case 1:
                price = 200;
                break;
            case 2:
                price = 300;
                break;
            case 3:
                price = 500;
                break;
            default:
                price = 0;
                System.out.println(ConsoleColors.RED+"						      Invalid ticket type selected."+ConsoleColors.RESET);
                break;
        }
    }

    public void showTicketDetails(String movieName) 
	{
        if (price > 0) 
		{
			System.out.print(ConsoleColors.YELLOW+"						Number of Persons : "+ConsoleColors.RESET);
			no_of_ppl = scanner.nextInt();
			
			float tax = 0.18f;
			float total = no_of_ppl*price;
			float tax2= tax*total;
			
            System.out.println("\n						Ticket booked for movie: " +ConsoleColors.GREEN+movieName+ConsoleColors.RESET);
            System.out.print("\n							Ticket Type: ");
			if(ticketType==1)
				System.out.print(ConsoleColors.GREEN+"Regular"+ConsoleColors.RESET);
			else if(ticketType==2)
				System.out.print(ConsoleColors.GREEN+"Medium"+ConsoleColors.RESET);
			else if(ticketType==3)
					System.out.print(ConsoleColors.GREEN+"VIP"+ConsoleColors.RESET);
			else
				System.out.print("");
            System.out.println("\n\n							Price: Rs." +ConsoleColors.GREEN+(tax2+total)+ConsoleColors.RESET);
			
			System.out.println();
			System.out.println();
			System.out.println(ConsoleColors.CYAN+"				        _______ _                 _  __     __              ");
			System.out.println("				       |__   __| |               | | \\ \\   / /              ");
			System.out.println("				          | |  | |__   __ _ _ __ | | _\\ \\_/ /__  _   _");
			System.out.println("				          | |  | '_ \\ / _` | '_ \\| |/ /\\   / _ \\| | | |");
			System.out.println("				          | |  | | | | (_| | | | |   <  | | (_) | |_| |");
			System.out.println("				          |_|  |_| |_|\\__,_|_| |_|_|\\_\\ |_|\\___/ \\__,_|"+ConsoleColors.RESET);
			System.out.println("\n");
			//return;
        } else {
            System.out.println("						   No valid ticket type selected.");
        }
    }
}

class MovieBookingApp {
    public static void main(String[] args) {
		
        User user = new User();
		
		System.out.println();
		System.out.println();
        System.out.println(ConsoleColors.CYAN+"					 __        __   _                          ");
		System.out.println("					 \\ \\      / /__| | ___ ___  _ __ ___   ___ ");
		System.out.println("					  \\ \\ /\\ / / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\");
		System.out.println("					   \\ V  V /  __/ | (_| (_) | | | | | |  __/");
		System.out.println("					    \\_/\\_/ \\___|_|\\___\\___/|_| |_| |_|\\___|"+ConsoleColors.RESET);
        System.out.println();
        System.out.println(ConsoleColors.YELLOW+"\033[1m	  					    T O   C I N E S N A P !\033[0m"+ConsoleColors.RESET);
		System.out.println();
		System.out.println();

        while (true) 
		{
            System.out.println("\n							1. Login");
			System.out.println();
            System.out.println("							2. Register");
			System.out.println();
            System.out.print("\033[1m						     CHOOSE AN OPTION: ");
            int choice = Ticket.scanner.nextInt();
			System.out.println();
            Ticket.scanner.nextLine();
			boolean loggedIn = false;

            switch (choice) {
                case 1:  // Login
                    if (!user.isRegistered()) {
                        System.out.println(ConsoleColors.RED+"					You are not registered. Please register first."+ConsoleColors.RESET);
                        break;
                    }
                    int attempts=0;
                    while (attempts<3 && !loggedIn) 
					{
                        System.out.print("\033[1m						      Enter username: ");
                        String username=Ticket.scanner.nextLine();
						System.out.println();
                        System.out.print("\033[1m						      Enter password: ");
                        int password=Ticket.scanner.nextInt();
						Ticket.scanner.nextLine(); 
                        loggedIn = user.login(username, password);
						

                        if (!loggedIn) {
                            attempts++;
                            if (attempts == 3) {
                                System.out.println(ConsoleColors.RED+"					Too many failed attempts! Try after sometime."+ConsoleColors.RESET);
                                return;
                            }
                        }
                    }
                    if (loggedIn) 
					{
						System.out.println(ConsoleColors.YELLOW+"\n						  Select MOVIE Languages"+ConsoleColors.RESET);
						System.out.println();
						System.out.println("						   1       2	   3");
						System.out.println();
						System.out.print("						Telugu   Hindi   English ");
						int c = Ticket.scanner.nextInt();
						if(c==1)
						{
						Movie.movie.display();
						System.out.println(ConsoleColors.BLUE+"\n							Telugu movies are"+ConsoleColors.RESET+"\n");
						Movie.movie.printMovies();
						
						System.out.print(ConsoleColors.YELLOW+"						Select movie choice: "+ConsoleColors.RESET);
						int cho = Ticket.scanner.nextInt();
						System.out.println();
						String chosenMovie = Movie.movie.getMovie(cho - 1);
						System.out.println("						You selected: " + ConsoleColors.BLUE+chosenMovie+ConsoleColors.RESET);
						Ticket.ticket.Tickettype(chosenMovie);
						return;
						}
						else if(c==2)
						{
							Movie.movie.display();
							System.out.println(ConsoleColors.BLUE+"\n							Hindi movies are"+ConsoleColors.RESET+"\n");
							
							Movie.movie.printMovies1();
							System.out.print(ConsoleColors.YELLOW+"						Select movie choice : "+ConsoleColors.RESET);
						int cho = Ticket.scanner.nextInt();
						System.out.println();
						String chosenMovie1 = Movie.movie.getMovie1(cho - 1);
						
                        System.out.println("						You selected: " +ConsoleColors.GREEN+chosenMovie1+ConsoleColors.RESET);
						Ticket.ticket.Tickettype(chosenMovie1);
						return;
						}
						else if(c==3)
						{
							Movie.movie.display();
							System.out.println(ConsoleColors.BLUE+"\n							English movies are\n"+ConsoleColors.RESET);
							
							Movie.movie.printMovies2();
							System.out.print(ConsoleColors.YELLOW+"						Select movie choice : "+ConsoleColors.RESET);
							
							int cho =Ticket.scanner.nextInt();
							String chosenMovie2 = Movie.movie.getMovie2(cho - 1);
							System.out.println();
							System.out.println("						You selected: " +ConsoleColors.GREEN+ chosenMovie2+ConsoleColors.RESET);
							System.out.println();
							Ticket.ticket.Tickettype(chosenMovie2);
							return;
						}
						else 
						{
							System.out.println("							Invalid ");
							
						}
                    }
                    break;
					
                case 2: 
                    if (user.isRegistered()) {
                        System.out.println(ConsoleColors.YELLOW+"					You are already registered. Please login."+ConsoleColors.RESET);
                        break;
                    }
					System.out.println(ConsoleColors.GREEN+"							REGISTRATION\n"+ConsoleColors.RESET);
                    System.out.print("\033[1m						      Enter username : \033[0m");
                    String regUsername = Ticket.scanner.nextLine();
					System.out.println();
                    System.out.print("\033[1m						      Enter password : \033[0m"+ConsoleColors.RESET);
                    int regPassword = Ticket.scanner.nextInt();
					Ticket.scanner.nextLine();
					System.out.println();
                    user.register(regUsername, regPassword);
					
                    break;
					
                default:
                    System.out.println(ConsoleColors.RED+"						Invalid option. Please try again."+ConsoleColors.RESET);
            }
        }
    }
}