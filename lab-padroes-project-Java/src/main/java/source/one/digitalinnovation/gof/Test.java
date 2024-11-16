package source.one.digitalinnovation.gof;

import source.one.digitalinnovation.gof.facade.Facade;
import source.one.digitalinnovation.gof.singleton.SingletonEager;
import source.one.digitalinnovation.gof.singleton.SingletonLazy;
import source.one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import source.one.digitalinnovation.gof.strategy.Comportamento;
import source.one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import source.one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import source.one.digitalinnovation.gof.strategy.ComportamentoNormal;
import source.one.digitalinnovation.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");
	}

}
