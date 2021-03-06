package enn.monitor.alarm.ticket.state;

import enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketStatus;
import enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable;
import enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState;

public class EnnMonitorAlarmTicketStateWaitingReceive implements EnnMonitorAlarmTicketStateInterface {
	
	public EnnMonitorAlarmTicketTable transform(EnnMonitorAlarmTicketTable ticketTable, 
			EnnMonitorAlarmTicketTransformState ticketState) throws Exception {
		EnnMonitorAlarmTicketTable.Builder newTicketTable = EnnMonitorAlarmTicketTable.newBuilder(ticketTable);
		
		switch (ticketState.getTicketTransformState()) {
		case Received:
			newTicketTable.setEnnMonitorAlarmTicketStatus(EnnMonitorAlarmTicketStatus.WaitingResolve);
			break;
		case SelfRecover:
			newTicketTable.setEnnMonitorAlarmTicketStatus(EnnMonitorAlarmTicketStatus.Resolved);
			break;
		default:
			throw new Exception("in WaitingResolved, the error transformState, it is " + ticketState.getTicketTransformState().name());
		}
		
		return newTicketTable.build();
	}
	
}
