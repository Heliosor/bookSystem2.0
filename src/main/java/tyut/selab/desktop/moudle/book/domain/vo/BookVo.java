package tyut.selab.desktop.moudle.book.domain.vo;

import tyut.selab.desktop.moudle.student.domain.vo.UserVo;

import java.util.Date;

/**
 * 向ui展示的数据
 */
public class BookVo {
    private UserVo bookUserVo;     //该图书拥有者的用户信息
    private String bookName;       //书名
    private int bookStatus;       //书的状态
    private Double bookPrice;     //书的价格
    private UserVo borrowBookUserVo;      //该图书借阅者的用户信息
    private Date borrowBookTime;     //借书时间
    private Date returnBookTime;      //还书时间

    public UserVo getBookUserVo() {
        return bookUserVo;
    }

    public void setBookUserVo(UserVo bookUserVo) {
        this.bookUserVo = bookUserVo;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(int bookStatus) {
        this.bookStatus = bookStatus;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public UserVo getBorrowBookUserVo() {
        return borrowBookUserVo;
    }

    public void setBorrowBookUserVo(UserVo borrowBookUserVo) {
        this.borrowBookUserVo = borrowBookUserVo;
    }

    public Date getBorrowBookTime() {
        return borrowBookTime;
    }

    public void setBorrowBookTime(Date borrowBookTime) {
        this.borrowBookTime = borrowBookTime;
    }

    public Date getReturnBookTime() {
        return returnBookTime;
    }

    public void setReturnBookTime(Date returnBookTime) {
        this.returnBookTime = returnBookTime;
    }
}
