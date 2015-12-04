package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayStack<E> implements Stack<E>
{
	
	private final E[] stack;
	private int index;
	
	/**
	 * @param arrayStack
	 */
	public ArrayStack()
	{
		stack = (E[]) new Object[10];
		index = 0;
	}

	@Override
	public void push(E element)
	{
		this.stack[index++] = element;
	}

	@Override
	public E pop()
	{
		return this.stack[--index];
	}

	@Override
	public E peek()
	{
		return this.stack[index-1];
	}

	@Override
	public int size()
	{
		return index;
	}
 
}
