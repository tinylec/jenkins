def call(openCoverExe, dotNetExe, outputFile) {
    bat "${openCoverExe} -target:\"${dotNetExe}\" -targetargs:\"test \\\"%WORKSPACE%\\\"\" -output:\"%WORKSPACE%\\${outputFile}\" -register"
}
