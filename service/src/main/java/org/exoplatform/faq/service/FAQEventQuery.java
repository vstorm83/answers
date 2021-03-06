/*
 * Copyright (C) 2003-2008 eXo Platform SAS.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see<http://www.gnu.org/licenses/>.
 */
package org.exoplatform.faq.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.exoplatform.commons.utils.ISO8601;
import org.exoplatform.forum.common.CommonUtils;
import org.exoplatform.services.log.ExoLogger;
import org.exoplatform.services.log.Log;

public class FAQEventQuery implements FAQNodeTypes {

  public static final String FAQ_CATEGORY               = "faqCategory";

  public static final String FAQ_QUESTION               = "faqQuestion";

  public static final String CATEGORY_AND_QUESTION      = "categoryAndQuestion";

  private static Log         log                        = ExoLogger.getLogger(FAQEventQuery.class);

  private String             type;

  private String             text;

  private String             name;

  private String             isModeQuestion;

  private String             moderator;

  private String             path;

  private String             author;

  private String             userId;

  private String             questionDisplayMode;

  private String             email;

  private String             question;

  private String             response;

  private String             comment;
  
  private String             asteriskConditionSearch;

  private String             attachment;

  private List<String>       userMembers;

  private Calendar           fromDate;

  private Calendar           toDate;

  private String             language                   = null;

  private boolean            isAnd                      = false;

  private boolean            isAdmin                    = false;

  private boolean            isExcerpt                 = false;

  private boolean            isQuestionLevelSearch      = false;

  private boolean            isLanguageLevelSearch      = false;

  private boolean            isAnswerCommentLevelSearch = false;

  private boolean            isSearchOnDefaultLanguage  = false;

  private List<String>       viewingCategories;

  private int                offset                     = 0;

  private int                limit                      = 0;

  private String             sort                       = "";//date, title, relevancy

  private String             order                      = "ASC";// (ASC, DESC)

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public void setQuestionDisplayMode(String questionDisplayMode) {
    this.questionDisplayMode = questionDisplayMode;
  }

  public String getQuestionDisplayMode() {
    return questionDisplayMode;
  }

  /**
   * Instantiates a new fAQ event query.
   */
  public FAQEventQuery() {
    viewingCategories = new ArrayList<String>();
  }

  /**
   * Gets the type.
   * 
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the type.
   * 
   * @param type the new type
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Gets the text.
   * 
   * @return the text
   */
  public String getText() {
    return text;
  }

  /**
   * Sets the text.
   * 
   * @param text the new text
   */
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Gets the name.
   * 
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the checks if is mode question.
   * 
   * @param isModeQuestion the new checks if is mode question
   */
  public void setIsModeQuestion(String isModeQuestion) {
    this.isModeQuestion = isModeQuestion;
  }

  /**
   * Gets the checks if is mode question.
   * 
   * @return the checks if is mode question
   */
  public String getIsModeQuestion() {
    return isModeQuestion;
  }

  /**
   * Sets the name.
   * 
   * @param name the new name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets the moderator.
   * 
   * @return the moderator
   */
  public String getModerator() {
    return moderator;
  }

  /**
   * Sets the moderator.
   * 
   * @param moderator the new moderator
   */
  public void setModerator(String moderator) {
    this.moderator = moderator;
  }

  /**
   * Gets the path.
   * 
   * @return the path
   */
  public String getPath() {
    return path;
  }

  /**
   * Sets the path.
   * 
   * @param path the new path
   */
  public void setPath(String path) {
    this.path = path;
  }

  /**
   * Gets the author.
   * 
   * @return the author
   */
  public String getAuthor() {
    return author;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUserId() {
    return userId;
  }

  /**
   * Sets the author.
   * 
   * @param author the new author
   */
  public void setAuthor(String author) {
    this.author = author;
  }

  /**
   * Gets the email.
   * 
   * @return the checks if is lock
   */
  public String getEmail() {
    return email;
  }

  /**
   * Sets the email.
   * 
   * @param email the new email
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Gets the question.
   * 
   * @return the question
   */
  public String getQuestion() {
    return question;
  }

  /**
   * Sets the question.
   * 
   * @param question the new question
   */
  public void setQuestion(String question) {
    this.question = question;
  }

  /**
   * Gets the response.
   * 
   * @return the response
   */
  public String getResponse() {
    return response;
  }

  /**
   * Sets the response.
   * 
   * @param response the new response
   */
  public void setResponse(String response) {
    this.response = response;
  }

  /**
   * Gets the attachment.
   * 
   * @return the attachment
   */
  public String getAttachment() {
    return attachment;
  }

  /**
   * Sets the attachment.
   * 
   * @param attachment the new attachment
   */
  public void setAttachment(String attachment) {
    this.attachment = attachment;
  }

  /**
   * @return the userMembers
   */
  public List<String> getUserMembers() {
    return userMembers;
  }

  /**
   * @param userMembers the userMembers to set
   */
  public void setUserMembers(List<String> userMembers) {
    this.userMembers = userMembers;
  }

  /**
   * Gets the from date.
   * 
   * @return the from date
   */
  public Calendar getFromDate() {
    return fromDate;
  }

  /**
   * Sets the from date.
   * 
   * @param fromDate the new from date
   */
  public void setFromDate(Calendar fromDate) {
    this.fromDate = fromDate;
  }

  /**
   * Gets the to date.
   * 
   * @return the to date
   */
  public Calendar getToDate() {
    return toDate;
  }

  /**
   * Sets the to date.
   * 
   * @param toDate the new to date
   */
  public void setToDate(Calendar toDate) {
    this.toDate = toDate;
  }

  /**
   * Gets the checks.
   * 
   * @return the checks if is true or false
   */
  public boolean getIsAnd() {
    return this.isAnd;
  }

  /**
   * @return the isAdmin
   */
  public boolean isAdmin() {
    return isAdmin;
  }

  /**
   * @param isAdmin the isAdmin to set
   */
  public void setAdmin(boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  /**
   * This method is query on search 
   * Gets the path query.
   * 
   * @return string the path query
   */
  public String getQuery() throws Exception {
    StringBuilder queryString = new StringBuilder();

    // ######################### Category Search ###########################
    if (type.equals(FAQ_CATEGORY)) { // Category Search
      queryString = buildCategoryQuery();
      // ###################### Question Search ############################
    } else if (type.equals(FAQ_QUESTION)) {
      queryString = buildQuestionQuery();
      // ###################### Quick Search ###############################
    } else if (type.equals(CATEGORY_AND_QUESTION)) {

      queryString = buildCategoryAndQuestionQuery();
    }
    if (log.isDebugEnabled()) {
      log.debug(queryString.toString());
    }
    return queryString.toString();
  }

  private StringBuilder buildCategoryQuery() {
    StringBuilder queryString;
    queryString = new StringBuilder();
    queryString.append("/jcr:root").append(path);
    queryString.append("//element(*,exo:faqCategory)");
    queryString.append("[(@exo:isView='true') ");

    if (text != null && text.length() > 0) {
      queryString.append(" and (jcr:contains(., '").append(text).append("'))");
    }
    if (name != null && name.length() > 0) {
      queryString.append(" and (jcr:contains(@exo:name, '").append(name).append("'))");
    }
    if (isModeQuestion != null && isModeQuestion.length() > 0 && !isModeQuestion.equals("AllCategories")) {
      queryString.append(" and (@exo:isModerateQuestions='").append(isModeQuestion).append("')");
    }
    if (moderator != null && moderator.length() > 0) {
      queryString.append(" and (jcr:contains(@exo:moderators, '").append(moderator).append("'))");
    }

    if (!isAdmin) {
      queryString.append(" and (not(@exo:userPrivate) or @exo:userPrivate=''");
      if (userMembers != null && !userMembers.isEmpty()) {
        for (String str : userMembers) {
          queryString.append(" or @exo:userPrivate='").append(str).append("' or @exo:moderators='").append(str).append("'");
        }
      }
      queryString.append(")");
    }

    if (fromDate != null) {
      queryString.append(" and (@exo:createdDate >= xs:dateTime('").append(ISO8601.format(fromDate)).append("'))");
    }
    if (toDate != null) {
      queryString.append(" and (@exo:createdDate <= xs:dateTime('").append(ISO8601.format(toDate)).append("'))");
    }

    queryString.append("]");
    return queryString;
  }

  private StringBuilder buildQuestionQuery() {
    StringBuilder queryString;
    // ## (questionSearch (or|and) languageSearch or answerSearch) and CategoryScoping and fulltextSearch ##
    queryString = new StringBuilder();
    isQuestionLevelSearch = false;
    isAnswerCommentLevelSearch = false;
    isAnd = false;
    queryString.append("/jcr:root").append(path);
    queryString.append("//* [");

    // search on main questions
    StringBuilder propertiesSearch = new StringBuilder("(");
    isAnd = false;
    if (author != null && author.length() > 0) {
      if (isAnd)
        propertiesSearch.append(" and ");
      propertiesSearch.append("jcr:contains(@exo:author, '").append(author).append("')");
      isAnd = true;
    }
    if (email != null && email.length() > 0) {
      if (isAnd)
        propertiesSearch.append(" and ");
      propertiesSearch.append("jcr:contains(@exo:email, '").append(email).append("')");
      isAnd = true;
    }
    if (fromDate != null) {
      if (isAnd)
        propertiesSearch.append(" and ");
      propertiesSearch.append("((@exo:createdDate >= xs:dateTime('").append(ISO8601.format(fromDate)).append("')) " + "or (@exo:dateResponse >= xs:dateTime('").append(ISO8601.format(fromDate)).append("')) " + "or (@exo:dateComment >= xs:dateTime('").append(ISO8601.format(fromDate)).append("')))");
      isAnd = true;
    }
    if (toDate != null) {
      if (isAnd)
        propertiesSearch.append(" and ");
      propertiesSearch.append("((@exo:createdDate <= xs:dateTime('").append(ISO8601.format(toDate)).append("')) " + "or (@exo:dateResponse <= xs:dateTime('").append(ISO8601.format(toDate)).append("')) " + "or (@exo:dateComment <= xs:dateTime('").append(ISO8601.format(toDate)).append("')))");
      isAnd = true;
    }
    propertiesSearch.append(")");
    if (propertiesSearch.length() > 2 || isSearchOnDefaultLanguage)
      isQuestionLevelSearch = true;

    // search on language questions
    StringBuilder questionLanguageSearch = new StringBuilder();
    if (!CommonUtils.isEmpty(question)) {
      questionLanguageSearch.append("(");
      //
      if(!CommonUtils.isEmpty(language))  {
        questionLanguageSearch.append("(@exo:language='").append(language).append("') and ");
      }
      questionLanguageSearch.append("(jcr:contains(@exo:title,'").append(question).append("')")
                            .append(" or jcr:contains(@exo:name, '").append(question).append("')");
      //
      String asteriskCondition = applyAsteriskCondition("@exo:title", "@exo:name");
      if(!CommonUtils.isEmpty(asteriskCondition)) {
        questionLanguageSearch.append(" or ").append(asteriskCondition);
      }
      questionLanguageSearch.append("))");
      //
      isLanguageLevelSearch = !isSearchOnDefaultLanguage;
    }

    // search on answers
    StringBuilder answerSearch = new StringBuilder();
    if (!CommonUtils.isEmpty(response)) {
      answerSearch.append("(");
      //
      if(!CommonUtils.isEmpty(language))  {
        answerSearch.append("(@exo:responseLanguage='").append(language).append("') and ");
      }
      String jcrCm = "jcr:contains";
      if(response.contains(CommonUtils.PERCENT_STR)){
        jcrCm = "jcr:like";
      }
      answerSearch.append("(").append(jcrCm).append("(@exo:responses,'").append(response).append("')");
      //
      String asteriskCondition = applyAsteriskCondition("@exo:responses");
      if(!CommonUtils.isEmpty(asteriskCondition)) {
        answerSearch.append(" or ").append(asteriskCondition);
      }
      answerSearch.append("))");
      isAnswerCommentLevelSearch = true;
    }

    
    // search on answers
    StringBuilder commentSearch = new StringBuilder();
    if (!CommonUtils.isEmpty(comment)) {
      commentSearch.append("(");
      //
      if(!CommonUtils.isEmpty(language))  {
        commentSearch.append("(@exo:commentLanguage='").append(language).append("') and ");
      }
      String jcrCm = "jcr:contains";
      if(comment.contains(CommonUtils.PERCENT_STR)){
        jcrCm = "jcr:like";
      }
      commentSearch.append("(").append(jcrCm).append("(@exo:comments,'").append(comment).append("')");
      //
      String asteriskCondition = applyAsteriskCondition("@exo:comments");
      if(!CommonUtils.isEmpty(asteriskCondition)) {
        commentSearch.append(" or ").append(asteriskCondition);
      }
      commentSearch.append("))");
      isAnswerCommentLevelSearch = true;
    }

    // search on category scoping
    StringBuilder searchCategoryScoping = new StringBuilder("(");
    for (String category : getViewingCategories()) {
      if (searchCategoryScoping.length() > 1)
        searchCategoryScoping.append(" or ");
      searchCategoryScoping.append("exo:categoryId='").append(category).append("'");
    }
    searchCategoryScoping.append(")");

    if (isAnd) {
      // System.out.println("questionSearch" + questionSearch.toString());
      queryString.append(propertiesSearch.toString());
    }
    boolean isAdd = false;
    // build scope of searching question, answer, comment
    // queryString.append(" and "); // [properties search clause] and [ question, answer, comment search clause]
    StringBuilder quesAnsComClause = new StringBuilder("");
    if (questionLanguageSearch.length() > 0) {
      quesAnsComClause.append("(").append(questionLanguageSearch.toString());
      isAdd = true;
    }

    if (answerSearch.length() > 2) {
      if (isAdd) {
        quesAnsComClause.append(" or ").append(answerSearch.toString());
      } else {
        quesAnsComClause.append("(").append(answerSearch.toString());
        isAdd = true;
      }
    }

    if (commentSearch.length() > 2) {
      if (isAdd) {
        quesAnsComClause.append(" or ").append(commentSearch.toString());
      } else {
        quesAnsComClause.append("(").append(commentSearch.toString());
        isAdd = true;
      }
    }

    StringBuilder textSearch = new StringBuilder("");

    if (text != null && text.length() > 0) {
      textSearch.append("(jcr:contains(., '").append(text).append("')");
      if(!CommonUtils.isEmpty(language)) {
        textSearch.append(" and ( ")
        .append(" @exo:language='").append(language).append("'")
        .append(" or @exo:commentLanguage='").append(language).append("'")
        .append(" or @exo:responseLanguage='").append(language).append("'")
        .append(")");
      }
      textSearch.append(")"); // close block.
      isLanguageLevelSearch = false;
      isAnswerCommentLevelSearch = false;
      isQuestionLevelSearch = false;
    }

    if (textSearch.length() > 0) {
      if (isAdd) {
        quesAnsComClause.append(" or ").append(textSearch.toString());
      } else {
        quesAnsComClause.append("(").append(textSearch.toString());
        isAdd = true;
      }
    }
    if (isAdd) {
      quesAnsComClause.append(")"); // close question, answer, comment search clause.
    }

    if (quesAnsComClause.length() > 0) {
      if (isAnd) {
        queryString.append(" and ");
      }
      queryString.append(quesAnsComClause.toString());
    }

    if (!isAnd && !isAdd && !CommonUtils.isEmpty(language)) { // if all of fields is empty of null, the search will be by language.
      queryString.append("(").append(" @exo:language='").append(language).append("'")
                 .append(" or @exo:commentLanguage='").append(language).append("'")
                 .append(" or @exo:responseLanguage='").append(language).append("'").append(")");
    }

    if (!searchCategoryScoping.toString().equals("()")) {
      if (isAnd || isAdd) {
        queryString.append(" and ").append(searchCategoryScoping.toString());
      } else {
        queryString.append(searchCategoryScoping.toString());
        isAdd = true;
      }
    }

    queryString.append("]"); // close property constraint

    if(isExcerpt) {
      queryString.append("/(").append(REP_EXCERPT).append(")");
    }

    // order
      if ("date".equalsIgnoreCase(sort)) {
        queryString.append(" order by @").append(EXO_CREATED_DATE);
      } else if ("title".equalsIgnoreCase(sort) || CommonUtils.isEmpty(sort)) {
        queryString.append(" order by @").append(EXO_TITLE);
      } else if("relevancy".equalsIgnoreCase(sort)) {
        queryString.append(" order by @").append(JCR_SCORE);
      }

      if ("DESC".equalsIgnoreCase(order)) {
        queryString.append(DESCENDING);
      } else if ("ASC".equalsIgnoreCase(order)) {
        queryString.append(ASCENDING);
      } else {
        queryString.append(ASCENDING);
      }
    return queryString;
  }
  
  private String applyAsteriskCondition(String... jcrField) {
    //for asterisk condition search
    StringBuilder sb = new StringBuilder();
    if (!CommonUtils.isEmpty(asteriskConditionSearch)) {
      for (String field : jcrField) {
        if(sb.length() > 0) {
          sb.append(" or ");
        }
        sb.append("jcr:contains(").append(field).append(",'").append(asteriskConditionSearch + "')");
      }     
    }
    return sb.toString();
  }

  private StringBuilder buildCategoryAndQuestionQuery() {
    StringBuilder queryString;
    // Quick search
    queryString = new StringBuilder();
    queryString.append("/jcr:root").append(path).append("//*[");
    if (text != null && text.length() > 0) {
      queryString.append(" jcr:contains(., '").append(text).append("')");
    }

    if (!isAdmin) {
      queryString.append(" and ( ");
      queryString.append("not(@exo:isApproved) or @exo:isApproved='true'");
      if (userId != null && userId.length() > 0) {
        queryString.append(" or exo:author='" + userId + "'");
      }
      queryString.append(" ) ");
    }

    // search on viewing categories
    StringBuilder queryViewing = new StringBuilder();
    for (String catId : viewingCategories) {
      if (queryViewing.length() > 0){
        queryViewing.append(" or ");
      }
      // on questions
      queryViewing.append("@exo:categoryId='").append(catId).append("'");
      // on categories
      queryViewing.append(" or @exo:id='").append(catId).append("'");
    }
    //
    if (queryViewing.length() > 0) {
      queryString.append(" and (").append(queryViewing).append(")");
    }
    // search restricted audience in category
    if(!isAdmin) {
      queryString.append(" and (");
      queryString.append(" not(@exo:userPrivate) or @exo:userPrivate=''");
      if (userMembers != null && userMembers.size() > 0) {
        for (String id : userMembers) {
          queryString.append(" or @exo:userPrivate='").append(id).append("'");
        }
      }
      queryString.append(" ) ");
    }

    // add condition for exo:dateResponse and exo:dateComment to search on answers & comments
    if (fromDate != null) {
      queryString.append(" and ((@exo:createdDate >= xs:dateTime('").append(ISO8601.format(fromDate)).append("')) " + "or (@exo:dateResponse >= xs:dateTime('").append(ISO8601.format(fromDate)).append("')) " + "or (@exo:dateComment >= xs:dateTime('").append(ISO8601.format(fromDate)).append("')))");
    }
    if (toDate != null) {
      queryString.append(" and ((@exo:createdDate <= xs:dateTime('").append(ISO8601.format(toDate)).append("')) " + "or (@exo:dateResponse <= xs:dateTime('").append(ISO8601.format(toDate)).append("')) " + "or (@exo:dateComment <= xs:dateTime('").append(ISO8601.format(toDate)).append("')))");
    }
    queryString.append("]");
    return queryString;
  }

  /**
  * This method check date time user input interface 
  * Sets the date from to.
  * 
  * @param fromDate the from date
  * @param toDate the to date
  * @param property the property
  * 
  * @return the string
  */

  public void setViewingCategories(List<String> viewingCategories) {
    this.viewingCategories = viewingCategories;
  }

  public List<String> getViewingCategories() {
    return viewingCategories;
  }

  public boolean isQuestionLevelSearch() throws Exception {
    return isQuestionLevelSearch;
  }

  public boolean isAnswerCommentLevelSearch() throws Exception {
    return isAnswerCommentLevelSearch;
  }

  public void setSearchOnDefaultLanguage(boolean isSearchOnDefaultLanguage) {
    this.isSearchOnDefaultLanguage = isSearchOnDefaultLanguage;
  }

  public boolean isSearchOnDefaultLanguage() {
    return isSearchOnDefaultLanguage;
  }

  public void setLanguageLevelSearch(boolean isLanguageLevelSearch) {
    this.isLanguageLevelSearch = isLanguageLevelSearch;
  }

  public boolean isLanguageLevelSearch() {
    return isLanguageLevelSearch;
  }

  public boolean isExcerpt() {
    return isExcerpt;
  }

  public void setExcerpt(boolean isExcerpt) {
    this.isExcerpt = isExcerpt;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public String getComment() {
    return comment;
  }

  public String getAsteriskConditionSearch() {
    return asteriskConditionSearch;
  }

  public void setAsteriskConditionSearch(String asteriskConditionSearch) {
    this.asteriskConditionSearch = asteriskConditionSearch;
  }

  public int getOffset() {
    return offset;
  }

  public void setOffset(int offset) {
    this.offset = offset;
  }

  public int getLimit() {
    return limit;
  }

  public void setLimit(int limit) {
    this.limit = limit;
  }

  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }
}
