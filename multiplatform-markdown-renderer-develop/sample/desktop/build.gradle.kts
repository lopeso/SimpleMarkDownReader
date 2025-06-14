import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    id("com.mikepenz.convention.kotlin-multiplatform")
    id("com.mikepenz.convention.compose")
    id("com.mikepenz.aboutlibraries.plugin")
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(project(":sample:shared"))
            implementation(compose.components.resources)
        }
        jvmMain.dependencies {
            implementation(compose.desktop.currentOs)
            implementation(libs.ktor.client.java)
        }
    }
}

compose.desktop {
    application {
        mainClass = "com.mikepenz.markdown.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "com.mikepenz.markdown"
            packageVersion = "1.0.0"
        }
    }
}

compose.resources {
    packageOfResClass = "com.mikepenz.markdown.sample.desktop.resources"
}

aboutLibraries {
    android {
        registerAndroidTasks = false
    }
    export {
        exportVariant = "jvmMain"
        outputPath = file("src/commonMain/composeResources/files/aboutlibraries.json")
    }
    library {
        duplicationMode = com.mikepenz.aboutlibraries.plugin.DuplicateMode.MERGE
    }
}
