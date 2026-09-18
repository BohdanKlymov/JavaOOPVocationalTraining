package org.example.September_2026.Week3.SnakeGame;
import java.awt.Point;

public class Gameplay {

    private Point playerPosition;
    private Point snakePosition;
    private Point goldPosition;
    private Point doorPosition;
    private boolean rich;

    public Gameplay() {
        playerPosition = new Point( 10, 9 );

        snakePosition  = new Point( 28, 1 );

        goldPosition   = new Point( 6, 6 );

        doorPosition   = new Point( 7, 11 );

        rich = false;
    }

        // Raster mit Figuren zeichnen
    void printTheField() {
        for ( int y = 0; y < 30; y++ ) {

            for ( int x = 0; x < 30; x++ ) {

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

     void checkStatus() {
        if ( rich && playerPosition.equals( doorPosition ) ) {

            System.out.println( "You wooon!" );

            return;

        }

                if ( playerPosition.equals( snakePosition ) ) {

            System.out.println( "ZZZZZZZ. Snake has caught you!" );

            return;

        }

                if ( playerPosition.equals( goldPosition ) ) {

            rich = true;

            goldPosition.setLocation( -1, -1 );

        }

    }

    public void moveUp(){
        playerPosition.y = Math.max(  0, playerPosition.y - 1 );
    }

    public void moveDown(){
        playerPosition.y = Math.min(  29, playerPosition.y + 1 );
    }

    public void moveLeft(){
        playerPosition.x = Math.max(  0, playerPosition.x - 1 );
    }

    public void moveRight(){
        playerPosition.x = Math.min( 29, playerPosition.x + 1 );
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
