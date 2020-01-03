version = "5"
description = "Allows you to import log files from ModSecurity and files previously exported from ZAP"

zapAddOn {
    addOnName.set("Log File Importer")
    zapVersion.set("2.8.0")

    manifest {
        author.set("ZAP Dev Team")
        url.set("https://github.com/zaproxy/zaproxy/wiki/MozillaMentorship_ImportingModSecurityLogs")

        helpSet {
            baseName.set("help%LC%.helpset")
            localeToken.set("%LC%")
        }
    }

    apiClientGen {
        api.set("org.zaproxy.zap.extension.importLogFiles.ImportLogAPI")
        messages.set(file("src/main/resources/org/zaproxy/zap/extension/importLogFiles/resources/Messages.properties"))
    }
}

dependencies {
    implementation(files("lib/org.jwall.web.audit-0.2.15.jar"))
}
