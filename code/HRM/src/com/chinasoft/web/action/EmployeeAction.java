package com.chinasoft.web.action;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.chinasoft.model.entity.Contract;
import com.chinasoft.model.entity.Employee;
import com.chinasoft.model.entity.TrainApply;
import com.chinasoft.model.entity.TrainEvaluation;
import com.chinasoft.model.entity.TrainFeedback;
import com.chinasoft.model.entity.TrainPlan;
import com.chinasoft.model.service.EmployeeService;
import com.chinasoft.model.service.TrainApplyService;
import com.chinasoft.model.service.TrainEvaluationService;
import com.chinasoft.model.service.TrainFeedbackService;
import com.chinasoft.model.service.TrainPlanService;
import com.opensymphony.xwork2.ActionSupport;


@Controller
public class EmployeeAction extends ActionSupport {
	
	@Resource
	private EmployeeService employeeService;
	@Resource
	private TrainPlanService trainPlanService;
	@Resource
	private TrainApplyService trainApplyService;
	@Resource
	private TrainFeedbackService trainFeedbackService;
	@Resource
	private TrainEvaluationService trainEvaluationService;
	
	private Employee employee;
	private String msg;
	private List<Contract> contracts;
	private List<TrainApply> trainApplies;
	private List<TrainPlan> trainPlans;
	private List<TrainFeedback> feedBacks;
	private List<TrainEvaluation> evaluations;
	private TrainApply apply;
	private TrainPlan plan;
	private String trainObject;
	private String trainEvaluation;
	private String trainDirect;
	private String trainContent;
	

	public String getTrainEvaluation() {
		return trainEvaluation;
	}

	public void setTrainEvaluation(String trainEvaluation) {
		this.trainEvaluation = trainEvaluation;
	}

	public List<TrainEvaluation> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(List<TrainEvaluation> evaluations) {
		this.evaluations = evaluations;
	}

	public List<TrainFeedback> getFeedBacks() {
		return feedBacks;
	}

	public void setFeedBacks(List<TrainFeedback> feedBacks) {
		this.feedBacks = feedBacks;
	}

	public String getTrainObject() {
		return trainObject;
	}

	public void setTrainObject(String trainObject) {
		this.trainObject = trainObject;
	}

	public String getTrainDirect() {
		return trainDirect;
	}

	public void setTrainDirect(String trainDirect) {
		this.trainDirect = trainDirect;
	}

	public String getTrainContent() {
		return trainContent;
	}

	public void setTrainContent(String trainContent) {
		this.trainContent = trainContent;
	}

	public TrainPlan getPlan() {
		return plan;
	}

	public void setPlan(TrainPlan plan) {
		this.plan = plan;
	}

	public TrainApply getApply() {
		return apply;
	}

	public void setApply(TrainApply apply) {
		this.apply = apply;
	}

	public List<TrainPlan> getTrainPlans() {
		return trainPlans;
	}

	public void setTrainPlans(List<TrainPlan> trainPlans) {
		this.trainPlans = trainPlans;
	}

	public TrainPlanService getTrainPlanService() {
		return trainPlanService;
	}

	public void setTrainPlanService(TrainPlanService trainPlanService) {
		this.trainPlanService = trainPlanService;
	}

	public List<TrainApply> getTrainApplies() {
		return trainApplies;
	}

	public void setTrainApplies(List<TrainApply> trainApplies) {
		this.trainApplies = trainApplies;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Employee getEmployee() {
		return employee;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

		
public List<Contract> getContracts() {
		return contracts;
	}

	public void setContracts(List<Contract> contracts) {
		this.contracts = contracts;
	}

	//	修改员工
	public String updateEmployee(){
	
		if (employeeService.updateEmployee(employee)) {
			ServletActionContext.getRequest().getSession().setAttribute("loginin", employee);
			msg = "ok";
		}else {	
			msg = "nook";
		}
		return "update";
	}
	
	public String contract(){
		
		String eId = ((Employee)ServletActionContext.getRequest().getSession().getAttribute("loginin")).getEid();
		Set<Contract> cSet = employeeService.getSingleEmployee(eId).getContracts();
		for (Iterator iterator = cSet.iterator(); iterator.hasNext();) {
				Contract contract = (Contract) iterator.next();
				contracts = new ArrayList<Contract>();
				contracts.add(contract);
		}	
	
		return "contract";
	}

	public String trainingapl(){
		String eId = ((Employee)ServletActionContext.getRequest().getSession().getAttribute("loginin")).getEid();
		Set<TrainApply> trainApply = employeeService.getSingleEmployee(eId).getTrainApplies();
		trainApplies = new ArrayList<TrainApply>();
		for (Iterator iterator = trainApply.iterator(); iterator.hasNext();) {
			TrainApply trainApply2 = (TrainApply) iterator.next();
			trainApplies.add(trainApply2);
		}
		trainPlans = trainPlanService.getallplan();
		return "trainApply";		
	}
 
//	添加培训申请
	
	public String addtrainapply(){
		
		Employee employee1 = ((Employee)ServletActionContext.getRequest().getSession().getAttribute("loginin"));
		apply.setEmployee(employee1);
		apply.setTrainMark(0);
		trainApplyService.addApply(apply);
		return "addapply";
	}
	
//	培训计划
	public String  trainingplan() {
		trainPlans = trainPlanService.getallplan();
		return "trainplan";	
	}
	
//	查找培训计划
	public String findplan(){	
		trainPlans = trainPlanService.getparamplan(trainObject, trainDirect, trainContent);
		return "trainplan";	
	}
	
	public String findfeed(){
		
		String eId = ((Employee)ServletActionContext.getRequest().getSession().getAttribute("loginin")).getEid();
		Set<TrainFeedback> feedbacks = employeeService.getSingleEmployee(eId).getTrainFeedbacks();
		feedBacks = new ArrayList<TrainFeedback>();
		for (Iterator iterator = feedbacks.iterator(); iterator.hasNext();) {
			TrainFeedback trainFeedback = (TrainFeedback) iterator.next();
			feedBacks.add(trainFeedback);
		}
		return "feed";
	}
	
	public String evalue(){
		
		evaluations = trainEvaluationService.getEvaluationsbydirect(trainDirect);
		
		return "evalue";
	}
	
	public String addevalue(){
		
		TrainEvaluation te = new TrainEvaluation();
		te.setEmployee((Employee)ServletActionContext.getRequest().getSession().getAttribute("loginin"));
		te.setTrainDirect(trainDirect);
		te.setTrainEvaluation(trainEvaluation);	
		trainEvaluationService.addEvaluation(te);
		evaluations = trainEvaluationService.getEvaluationsbydirect(trainDirect);
		return "addevalue";
	}
	
}
