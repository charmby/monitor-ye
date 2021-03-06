package enn.monitor.framework.ai.nn.activation;

import java.util.List;

import enn.monitor.framework.ai.nn.NNObject;
import enn.monitor.framework.ai.nn.weights.NNWeightEnum;

public class NNActivationSoftsign implements NNActivationInterface {

	@Override
	public double activation(double x, double a, double multiple) {
		return x / (1 + Math.abs(x));
	}

	@Override
	public void backPropagate(NNObject nnObject, NNWeightEnum nnWeightEnum, List<Double> targetOutputList, List<Double> outputList)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
}
