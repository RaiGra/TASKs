package vsu.cs.solitaire;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Game extends JFrame implements WindowListener {

  private SolitaireBoard board;

  public Game() {
    super("Solitaire");
    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    addWindowListener(this);

    board = SolitaireBoard.load();

    getContentPane().add(board);
    pack();
  }

  public static void main(String[] args) {
    Game game = new Game();
    game.setVisible(true);
  }

  @Override
  public void windowClosing(WindowEvent e) {
    board.save();
    dispose();
  }

  @Override
  public void windowActivated(WindowEvent e) {
  }

  @Override
  public void windowDeactivated(WindowEvent e) {
  }

  @Override
  public void windowOpened(WindowEvent e) {
  }

  @Override
  public void windowClosed(WindowEvent e) {
  }

  @Override
  public void windowIconified(WindowEvent e) {
  }

  @Override
  public void windowDeiconified(WindowEvent e) {
  }

}
