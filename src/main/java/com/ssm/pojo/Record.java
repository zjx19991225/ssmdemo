package com.ssm.pojo;

public class Record {
    private int recordId;
    private int readerId;
    private int bookId;
    private String readerName;
    private String bookName;
    private  int number;

    public Record(int recordId, int readerId, int bookId, String readerName, String bookName, int number) {
        this.recordId = recordId;
        this.readerId = readerId;
        this.bookId = bookId;
        this.readerName = readerName;
        this.bookName = bookName;
        this.number = number;
    }

    public Record() {
    }

    public int getReaderId() {
        return readerId;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Record{" +
                "recordId=" + recordId +
                ", readerId=" + readerId +
                ", bookId=" + bookId +
                ", readerName='" + readerName + '\'' +
                ", bookName='" + bookName + '\'' +
                ", number=" + number +
                '}';
    }
}
