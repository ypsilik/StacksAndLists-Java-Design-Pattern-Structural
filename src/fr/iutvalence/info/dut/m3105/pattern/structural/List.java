package fr.iutvalence.info.dut.m3105.pattern.structural;

public interface List<E>
{
	public void add(int position, E element);
	public E remove(int position);
	public E get(int position);
	public int size();
}
