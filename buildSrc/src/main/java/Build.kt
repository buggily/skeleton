object Build {

    const val NAMESPACE = "com.buggily.skeleton"
    const val ID = NAMESPACE

    const val RUNNER = "androidx.test.runner.AndroidJUnitRunner"

    object Sdk {
        const val MIN = 24
        const val COMPILE = 33
        const val TARGET = 32
    }

    object OptIns {
        const val SERIALIZATION = "kotlinx.serialization.ExperimentalSerializationApi"
    }
}
