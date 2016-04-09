package my.project.ebanking.actions;

import java.io.File;
import javax.servlet.ServletContext;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SingleFileUpload extends ActionSupport {
	private File attachment;
	private String attachmentFileName;
	private String attachmentContentType;
	private String description;

	public String upload() throws Exception {
		System.out.println(description);
		ServletContext servletContext = ServletActionContext.getServletContext();
		if (attachment != null) {
			String dataDir = servletContext.getRealPath("/uploadedImages");
			File savedFile = new File(dataDir, attachmentFileName);
			attachment.renameTo(savedFile);
		}
		return SUCCESS;
	}

	public File getAttachment() {
		return attachment;
	}

	public void setAttachment(File attachment) {
		this.attachment = attachment;
	}

	public String getAttachmentFileName() {
		return attachmentFileName;
	}

	public void setAttachmentFileName(String attachmentFileName) {
		this.attachmentFileName = attachmentFileName;
	}

	public String getAttachmentContentType() {
		return attachmentContentType;
	}

	public void setAttachmentContentType(String attachmentContentType) {
		this.attachmentContentType = attachmentContentType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
