package com.ai.crawler.entity;

import java.math.BigInteger;
import java.util.Date;

import org.jsoup.nodes.Document;

public class WebPage {
	private String url;
	private Date fetchTime;
	private String parentURL;
	private Date fetchingTime;
	private BigInteger pageIdentity;
	private String title;
	private Document document;
	private String content;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getFetchTime() {
		return fetchTime;
	}

	public void setFetchTime(Date fetchTime) {
		this.fetchTime = fetchTime;
	}

	public String getParentURL() {
		return parentURL;
	}

	public void setParentURL(String parentURL) {
		this.parentURL = parentURL;
	}

	public Date getFetchingTime() {
		return fetchingTime;
	}

	public void setFetchingTime(Date fetchingTime) {
		this.fetchingTime = fetchingTime;
	}

	public BigInteger getPageIdentity() {
		return pageIdentity;
	}

	public void setPageIdentity(BigInteger pageIdentity) {
		this.pageIdentity = pageIdentity;
	}

	public String getTitle() {
		if(title == null)
			return "";
		else
			return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public String getContent() {
		if(content == null)
			return "";
		else 
			return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return new StringBuilder().append("PageIdentity:").append(pageIdentity).append("\n").append("URL:").append(url)
				.append("\n").append("ParentURL:").append(parentURL).append("\n").append("Title:").append(title)
				.toString();
	}
}