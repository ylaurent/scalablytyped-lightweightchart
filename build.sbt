/* ScalablyTyped configuration */
enablePlugins(ScalablyTypedConverterPlugin)
scalaVersion := "3.2.0"
name := "scalablytyped-lightweightchart"
version := "0.1"
Compile / npmDependencies ++= Seq(
  "lightweight-charts" -> "3.8.0"
)
scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.CommonJSModule).withSourceMap(false) }
useYarn := true
