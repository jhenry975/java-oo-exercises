

public class Rectangle 
{
	private int l; //left
	private int w; //right

	
	public Rectangle(int l, int w)
	{
		this.l = l;
		this.w = w;		
	}
	
	
	public boolean isSmaller(Rectangle r2)
	{
		if(this.area() > r2.l * r2.w)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public int area()
	{
		return this.l * this.w;
	}
	
	public int perimeter()
	{
		return this.l * 2 + this.w * 2;
	}
	
	public boolean isSquare()
	{
		if(this.l == this.w)
		{
			return true;
		}
		return false;
	}


	public static void main(String[] args)
	{
		Rectangle r2 = new Rectangle(2, 3);
		Rectangle r1 = new Rectangle(1, 1);
		
		System.out.println(r2.isSmaller(r1));
		System.out.println(r2.area());
		System.out.println(r2.perimeter());
		System.out.println(r2.isSquare());
	}

}
