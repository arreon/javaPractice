public class Main {
    public static void main( String[] args )
    {
        int people = 20;
        int cats = 30;
        int dogs = 15;


        cats -= 10;

        if ( people < cats )
        {
            System.out.println( "Too many cats!  The world is doomed!" );
//            if people are less than cats, he write message
        }

        if ( people > cats )
        {
            System.out.println( "Not many cats!  The world is saved!" );
//            if people are greater than cats, he write message
        }

        if ( people < dogs )
        {
            System.out.println( "The world is drooled on!" );
//            if people are less than dogs, he write message
        }

        if ( people > dogs )
        {
            System.out.println( "The world is dry!" );
//            if people are greater than dogs, he write message
        }

        dogs += 5;
//        this command plus five dogs

        if ( people >= dogs )
        {
            System.out.println( "People are greater than or equal to dogs." );
//            if people are greater than or equal dogs, he write message
        }

        if ( people <= dogs )
        {
            System.out.println( "People are less than or equal to dogs." );
//            if people are less than or equal dogs, he write message
        }

        if ( people == dogs ) {
            System.out.println("People are dogs.");
//            if people are equal dogs, he write message


//            if i don't use the curly braces, he may give an error
        }
    }
}
