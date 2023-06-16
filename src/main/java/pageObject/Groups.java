package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Groups {

	@FindBy(how=How.XPATH,using="(//div[@class='avatar-container'])[2]")
	private WebElement headerDropdown;
	
	@FindBy(how=How.XPATH,using="//li[text()=' My Groups ']")
	private WebElement MyGropus;
	
	@FindBy(how=How.XPATH,using="//button[text()=' Create group ']")
	private WebElement BeforeCreateGroupsButton;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter group name']")
	private WebElement GroupName;
	
	@FindBy(how=How.XPATH,using="//input[@role='checkbox']")
	private WebElement IAgreeCheckbox;
	
	@FindBy(how=How.XPATH,using="//button[@aria-label='Back']")
	private WebElement GroupBackButton;
	
	@FindBy(how=How.XPATH,using="//button[@class='sb-btn sb-btn-primary sb-btn-normal flex-ai-jc-center mb-8 ng-star-inserted']")
	private WebElement AfterCreateGroupsButton;
	
	@FindBy(how=How.XPATH,using="(//div[@class='sb--card__main-area'])[1]")
	private WebElement Selectgroup;
	
		//	(//div[@Class='sb--card sb--card--course--curiculum ng-star-inserted'])[1]
			//div[contains(text(),'GroupName_')]
	
	@FindBy(how=How.XPATH,using="//div[text()=' Add member ']")
	private WebElement AddMember;
	
	@FindBy(how=How.XPATH,using="//a[@aria-label='Close Welcome dialog']")
	private WebElement CrossTab;
	
	@FindBy(how=How.XPATH,using="//a[@aria-label='Close Member dialog']")
	private WebElement IdCrossTab;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter DIKSHA ID']")
	private WebElement SearchId;
	
	@FindBy(how=How.XPATH,using="(//button[text()='Verify'])[1]")
	private WebElement VerifyId;
	//button[text()=' Add to group ']
	@FindBy(how=How.XPATH,using="//button[text()=' Add to group ']")
	private WebElement IdSelected;
	
	@FindBy(how=How.XPATH,using="//button[text()=' Add activity ']")
	private WebElement AddActivity;
	
	@FindBy(how=How.XPATH,using="//h4[@title='Digital textbooks']")
	private WebElement DigitalTextbook;
	
	@FindBy(how=How.XPATH,using="//span[text()='Add to group']")
	private WebElement SelectBook;
	
	
	@FindBy(how=How.XPATH,using="(//div[@Class='sb--card sb--card--theme2 sb--card--recently-viewed ng-star-inserted'])[1]")
    private WebElement OverTheBook;
	

	
	@FindBy(how=How.XPATH,using="//div[@Class='kabab-menu']")
    private WebElement kababmenu;
	
	@FindBy(how=How.XPATH,using="//div[text()=' Enable discussions ']")
    private WebElement EnableOption;
	
	@FindBy(how=How.XPATH,using="//div[text()=' Disable discussions ']")
    private WebElement DisableOption;
	
	@FindBy(how=How.XPATH,using="//button[text()='Disable discussions']")
    private WebElement DisableOptionPopup;
	
	@FindBy(how=How.XPATH,using="//button[@title='Forum']")
    private WebElement ForumOption;
	
	@FindBy(how=How.XPATH,using="//a[text()='Categories']")
    private WebElement categories;
	
	@FindBy(how=How.XPATH,using="//a[text()='Tags']")
    private WebElement tags;
	
	@FindBy(how=How.XPATH,using="//a[text()='My discussion']")
    private WebElement MyDiscussion;
	
	@FindBy(how=How.XPATH,using="//a[text()=' Recent posts ']")
    private WebElement Recentposts;
	
	@FindBy(how=How.XPATH,using="//a[text()=' Best posts ']")
    private WebElement Bestposts;
	
	@FindBy(how=How.XPATH,using="//a[text()=' Saved posts ']")
    private WebElement Savedposts;
	
	@FindBy(how=How.XPATH,using="//a[text()=' Upvoted ']")
    private WebElement Upvoted;
	
	@FindBy(how=How.XPATH,using="//a[text()=' Downvoted ']")
    private WebElement Downvoted;
	
	@FindBy(how=How.XPATH,using="//button[@id='close-discussion-forum']")
    private WebElement DiscussionCloseButton;
	
	@FindBy(how=How.XPATH,using="//h4[text()='Course']")
    private WebElement CourseTab;
	
	@FindBy(how=How.XPATH,using="//input[@id='search-for-content-group']")
    private WebElement SearchCourse;
	
	@FindBy(how=How.XPATH,using="(//button[text()='Search'])[2]")
    private WebElement SearchCourseButton;
	
	@FindBy(how=How.XPATH,using="//div[@Class='sb--card ng-star-inserted']")
    private WebElement SelectClass;
	
	@FindBy(how=How.XPATH,using="//button[text()=' Activity Dashboard']")
    private WebElement ActivityDashboard;
	
	@FindBy(how=How.XPATH,using="(//td[text()='0'])[1]")
    private WebElement ProgressInDashboard;
	
	public WebElement getProgressInDashboard() {
		return  ProgressInDashboard;
	}
	
	
	
	public WebElement getActivityDashboard() {
		return  ActivityDashboard;
	}
	
	
	public WebElement getSelectClass() {
		return  SelectClass;
	}
	
	
	public WebElement getSearchCourseButton() {
		return  SearchCourseButton;
	}
	
	public WebElement getSearchCourse() {
		return  SearchCourse;
	}
	
	public WebElement getCourseTab() {
		return  CourseTab;
	}
	

	public WebElement getDiscussionCloseButton() {
		return  DiscussionCloseButton;
	}
	
	
	public WebElement getDisableOptionPopup() {
		return  DisableOptionPopup;
	}
	
	
	public WebElement getDisableOption() {
		return DisableOption;
	}
	
	
	public WebElement getCategories() {
		return categories;
	}

	public void setCategories(WebElement categories) {
		this.categories = categories;
	}

	public WebElement getTags() {
		return tags;
	}

	public void setTags(WebElement tags) {
		this.tags = tags;
	}

	public WebElement getMyDiscussion() {
		return MyDiscussion;
	}

	public void setMyDiscussion(WebElement myDiscussion) {
		MyDiscussion = myDiscussion;
	}

	public WebElement getRecentposts() {
		return Recentposts;
	}

	public void setRecentposts(WebElement recentposts) {
		Recentposts = recentposts;
	}

	public WebElement getBestposts() {
		return Bestposts;
	}

	public void setBestposts(WebElement bestposts) {
		Bestposts = bestposts;
	}

	public WebElement getSavedposts() {
		return Savedposts;
	}

	public void setSavedposts(WebElement savedposts) {
		Savedposts = savedposts;
	}

	public WebElement getUpvoted() {
		return Upvoted;
	}

	public void setUpvoted(WebElement upvoted) {
		Upvoted = upvoted;
	}

	public WebElement getDownvoted() {
		return Downvoted;
	}

	public void setDownvoted(WebElement downvoted) {
		Downvoted = downvoted;
	}

	public WebElement getForumOption() {
		return ForumOption;
	}
	
	public WebElement getEnableOption() {
		return EnableOption;
	}
	
	
	public WebElement getkababmenu() {
		return kababmenu;
	}

	
	public WebElement getIdCrossTab() {
		return IdCrossTab;
	}

	
	
	public WebElement getOverTheBook() {
		return OverTheBook;
	}
	
	
	public WebElement getHeaderDropdown() {
		return headerDropdown;
	}

	public void setHeaderDropdown(WebElement headerDropdown) {
		this.headerDropdown = headerDropdown;
	}

	public WebElement getMyGropus() {
		return MyGropus;
	}

	public void setMyGropus(WebElement myGropus) {
		MyGropus = myGropus;
	}

	public WebElement getBeforeCreateGroupsButton() {
		return BeforeCreateGroupsButton;
	}

	public WebElement getIAgreeCheckbox() {
		return IAgreeCheckbox;
	}
	
	
	
	public void setBeforeCreateGroupsButton(WebElement beforeCreateGroupsButton) {
		BeforeCreateGroupsButton = beforeCreateGroupsButton;
	}

	public WebElement getGroupName() {
		return GroupName;
	}

	public void setGroupName(WebElement groupName) {
		GroupName = groupName;
	}

	public WebElement getAfterCreateGroupsButton() {
		return AfterCreateGroupsButton;
	}

	public void setAfterCreateGroupsButton(WebElement afterCreateGroupsButton) {
		AfterCreateGroupsButton = afterCreateGroupsButton;
	}

	public WebElement getGroupBackButton() {
		return GroupBackButton;
	}
	
	public WebElement getSelectgroup() {
		return Selectgroup;
	}

	public void setSelectgroup(WebElement selectgroup) {
		Selectgroup = selectgroup;
	}

	public WebElement getAddMember() {
		return AddMember;
	}

	public void setAddMember(WebElement addMember) {
		AddMember = addMember;
	}

	public WebElement getCrossTab() {
		return CrossTab;
	}

	public void setCrossTab(WebElement crossTab) {
		CrossTab = crossTab;
	}

	public WebElement getSearchId() {
		return SearchId;
	}

	public void setSearchId(WebElement searchId) {
		SearchId = searchId;
	}

	public WebElement getVerifyId() {
		return VerifyId;
	}

	public void setVerifyId(WebElement verifyId) {
		VerifyId = verifyId;
	}

	public WebElement getIdSelected() {
		return IdSelected;
	}

	public void setIdSelected(WebElement idSelected) {
		IdSelected = idSelected;
	}

	public WebElement getAddActivity() {
		return AddActivity;
	}

	public void setAddActivity(WebElement addActivity) {
		AddActivity = addActivity;
	}

	public WebElement getDigitalTextbook() {
		return DigitalTextbook;
	}

	public void setDigitalTextbook(WebElement digitalTextbook) {
		DigitalTextbook = digitalTextbook;
	}

	public WebElement getSelectBook() {
		return SelectBook;
	}

	public void setSelectBook(WebElement selectBook) {
		SelectBook = selectBook;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
