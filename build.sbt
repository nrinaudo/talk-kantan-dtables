enablePlugins(TutPlugin, GhpagesPlugin)

organization := "com.nrinaudo"
scalaVersion := "2.12.8"

val tutDirName = settingKey[String]("tut output directory")
tutDirName := "./"

addMappingsToSiteDir(tut, tutDirName)
includeFilter in SitePlugin.autoImport.makeSite :=
    "*.yml" | "*.md" | "*.html" | "*.css" | "*.png" | "*.jpg" | "*.gif" | "*.js" | "*.eot" | "*.svg" | "*.ttf" |
    "*.woff" | "*.woff2" | "*.otf"

git.remoteRepo := "git@github.com:nrinaudo/talk-kantan-dtables.git"

libraryDependencies ++= Seq(
  "com.nrinaudo"   %% "kantan.dtables-scalatest" % "0.1.0-SNAPSHOT",
  "com.nrinaudo"   %% "kantan.dtables-csv" % "0.1.0-SNAPSHOT",
  "org.scalatest"  %% "scalatest" % "3.0.5",
  "org.scalacheck" %% "scalacheck" % "1.13.5"
)
