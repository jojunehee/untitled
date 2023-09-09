package org.example;

public interface ICRUD {
    public Object  add();//추가
    public int update(Object obj);//업데이트
    public int delete(Object obj);//삭제
    public void selectOne(int id);//하나를 조회
}
