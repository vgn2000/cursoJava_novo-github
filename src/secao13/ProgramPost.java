package secao13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import entidades.Comment;
import entidades.Post;

public class ProgramPost {

	public static void main(String[] args) throws ParseException {
	
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("E, dd/MM/yyyy: HH:mm:ss Z", Locale.ROOT);
		
		
		Comment c1 = new Comment("Have a nice Trip");
		Comment c2 = new Comment("Wow that's awesome");
		
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44" ),
				"Travelling to New Zeland" ,
				"I am goig to visit this wonderfull country", 12);
		
		
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		
		
		
        
	}

}
