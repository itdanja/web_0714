package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Dao.BoardDao;
import Domain.BoardDto;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class CommuntypageController implements Initializable {

	private static BoardDto boarddto; // ���� Ŭ���� �Խù��� ������
	
	private static CommuntypageController instance;
	
	public CommuntypageController() { // ����Ŭ������ ���ΰ�ü
		instance = this;
	}
	
	public static CommuntypageController getinstance() {
		return instance;
	}
	public BoardDto getboard() {
		return boarddto;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// �ش� �������� �������� �ʱⰪ �������ִ� �޼ҵ� 
		// 1. DAO ��ü 
		BoardDao boardDao = BoardDao.getboarddao();
		// 2. DAO �޼ҵ� ���� 
		ObservableList<BoardDto> boardDtos =  boardDao.boardlist();
		// 3. ����� ���̺��� �� �ʵ忡 �� �ֱ� 
		TableColumn tc = tableview.getColumns().get(0); // ù��° ��[�ʵ�] �������� 
		tc.setCellValueFactory( new PropertyValueFactory<>("bno") );
		
		tc = tableview.getColumns().get(1); // �ι�° ��[�ʵ�] �������� 
		tc.setCellValueFactory( new PropertyValueFactory<>("btitle") );
		
		tc = tableview.getColumns().get(2); // ����° ��[�ʵ�] �������� 
		tc.setCellValueFactory( new PropertyValueFactory<>("bwriter"));
		
		tc = tableview.getColumns().get(3); // �׹�° ��[�ʵ�] �������� 
		tc.setCellValueFactory( new PropertyValueFactory<>("bdate") );
		
		tc = tableview.getColumns().get(4); // �ټ���° ��[�ʵ�] �������� 
		tc.setCellValueFactory( new PropertyValueFactory<>("bcount"));
		// 4. ���̺��� ����Ʈ ���� 
		tableview.setItems(boardDtos); // ���̺� ����Ʈ �ֱ� 
		
		// ���̺� �� Ŭ�������� �̺�Ʈ 
			//tableview.setOnMouseClicked( (MouseEvent event ) -> { �����ڵ� } );
									// ���ٽ� : �͸�޼ҵ� [  �μ� -> �����ڵ�  ]
		tableview.setOnMouseClicked(  ( MouseEvent event ) -> { 
			if( event.getButton().equals( MouseButton.PRIMARY) ) { // �ش� �̺�Ʈ�� Ŭ���̸� 
							// ���̺��� ������ ��[��]�� ������[����]
				boarddto = tableview.getSelectionModel().getSelectedItem();
				// ��ȸ�� ���� 
				boardDao.boardcount( boarddto.getBcount()+1 , boarddto.getBno() );
				
				MainpageController.getinstance().loadpage("boardviewpage");
			}
		} );
	}
	// fx:id 
    @FXML
    private TableView<BoardDto> tableview; // ObservableList 
    			// <  >  : ���׸� 
    @FXML
    private Button btnboardwrite;

    @FXML
    void boardwrite(ActionEvent event) {
    	MainpageController.getinstance().loadpage("boardwritepage");
    }
}
