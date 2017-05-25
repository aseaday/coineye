CoinEye
===

 CoinEye is an framework which help investors and developers to find the risks and optunities in virtual coin investment.It should has three parts:

 - marketAdaptor: A market Adaptor is like a driver but just provide ability to collect trading information and other basic trade operations which providers like okcoin may serve. It expose an standard interface which other parts of coineye could use.

 - viewBoard: It is like an bloomberg console which show realtime trading data and news. The trading data is from marketAdaptor and you could trade without login other websites. For developers who didn't knows bloomberg conolse, just refer to something heapster.

 - coinQuant: It is like an `Jupyter` which help you to write your own index or strategy, you could view [uqer.io](uqer.io) to get more inforamtion. The index it calcs could be used by other stargegy or index program and you also could watch it on viewBoard.