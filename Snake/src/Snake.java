import java.util.ArrayList;

public class Snake {

	int width;
	Box head;
	ArrayList<Box> snake = new ArrayList();

	/**
	 * Constructeur avec paramètres
	 * @param _width
	 * @param _head
	 * @param _snake
	 */
	public Snake(Box _head, ArrayList _snake)
	{
		this.head = _head;
		this.snake = _snake;
	}
	/**
	 * Manger
	 * @param _box
	 * @return
	 */
	public int manger(Box _box)
	{
		this.snake.set(0,this.head);
		if (this.head.intersects(_box))
		{
			snake.add(_box);
		}
		return width;
	}

	public void bouger()
	{
		for (int i=0;i <= this.snake.size();i++)
		{
			if(i>0)
			{
			this.snake.get(i-1).x = this.snake.get(i).x;
			this.snake.get(i-1).y = this.snake.get(i).y;
			}
		}
	}
}
