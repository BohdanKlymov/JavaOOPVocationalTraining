package org.example.September_2026.Week3.SnakeGame;
import java.awt.Point;
import java.util.Random;

public class Gameplay {

    private PointForPosition playerPosition;
    private PointForPosition snakePosition;
    private PointForPosition goldPosition;
    private PointForPosition doorPosition;
    private boolean rich;

    public int fieldManPointForObject = 29;

    public Gameplay() {

        Random random = new Random();

        playerPosition = new PointForPosition( random.nextInt(fieldManPointForObject - 1) + 1, random.nextInt(fieldManPointForObject - 1) + 1 );

        snakePosition  = new PointForPosition( random.nextInt(fieldManPointForObject - 1) + 1, random.nextInt(fieldManPointForObject - 1) + 1 );

        goldPosition   = new PointForPosition( random.nextInt(fieldManPointForObject - 1) + 1, random.nextInt(fieldManPointForObject - 1) + 1 );

        doorPosition   = new PointForPosition( random.nextInt(fieldManPointForObject - 1) + 1, random.nextInt(fieldManPointForObject - 1) + 1 );

        rich = false;
    }

        // Raster mit Figuren zeichnen
    void printTheField() {
        for ( int y = 0; y < fieldManPointForObject + 1; y++ ) {

            for ( int x = 0; x < fieldManPointForObject + 1; x++ ) {

                Point p = new Point( x, y );

                if ( playerPosition.equals( p ) )

                    System.out.print( "\uD83D\uDE00" );

                else if ( snakePosition.equals( p ) )

                    System.out.print( "\uD83D\uDC0D" );

                else if ( goldPosition.equals( p ) )

                    System.out.print( " 💰" );

                else if ( doorPosition.equals( p ) )

                    System.out.print( " \uD83D\uDEAA" );

                else System.out.print( " . " );

            }

            System.out.println();

        }
    }

     boolean checkStatus() {

        if (playerPosition.equals(doorPosition) && !rich) {
            System.out.println("You ran away, but you're stil poor!");

            return false;
        }

        if ( playerPosition.equals( goldPosition ) ) {

            rich = true;

            goldPosition.setLocation( -1, -1 );

        }

        if ( rich && playerPosition.equals( doorPosition ) ) {

            System.out.println( "You wooon!" );

            return false;

        }

        if ( playerPosition.equals( snakePosition ) ) {

            System.out.println( "ZZZZZZZ. Snake has caught you!" );

            return false;

        }

        return true;
    }

    public void moveUp(){
        playerPosition.y = Math.max(  0, playerPosition.y - 1 );
    }

    public void moveDown(){
        playerPosition.y = Math.min(  fieldManPointForObject, playerPosition.y + 1 );
    }

    public void moveLeft(){
        playerPosition.x = Math.max(  0, playerPosition.x - 1 );
    }

    public void moveRight(){
        playerPosition.x = Math.min( fieldManPointForObject, playerPosition.x + 1 );
    }

    public void snakeMovesToPlayer() {
        if ( playerPosition.x < snakePosition.x )

            snakePosition.x--;

        else if ( playerPosition.x > snakePosition.x )

            snakePosition.x++;

        if ( playerPosition.y < snakePosition.y )

            snakePosition.y--;

        else if ( playerPosition.y > snakePosition.y )

            snakePosition.y++;
    }
}
