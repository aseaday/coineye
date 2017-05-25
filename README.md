CoinEye
===

 CoinEye is a framework which helps investors and developers to find the risks and optunities in bitcoin market. It has three parts:

 - marketAdaptor: A market adaptor is like a driver but just provides ability to collect trading information and other basic trade operations which providers as okcoin may serve. It should exposes an standard interface which other parts of coineye could use.

 - viewBoard: It is like a `bloomberg console` which show realtime trading data and news. The trading data is from marketAdaptor and you could trade without login other websites. For developers who didn't knows bloomberg conolse, just refer to `heapster`.

 - coinQuant: It is like an `Jupyter` which help you to write your own index or strategy, you could view [uqer.io](uqer.io) to get more inforamtion. The index it calcs could be used by other stargegy or index program and you also could watch it on viewBoard.
