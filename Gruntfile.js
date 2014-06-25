module.exports = function(grunt) {

    grunt.loadNpmTasks('grunt-protractor-runner');
    grunt.loadNpmTasks('grunt-contrib-uglify');

    grunt.registerTask('hello', 'say hello', function(){
        grunt.log.writeln("Hello from grunt");
    });

    grunt.registerTask('default', 'hello');

    grunt.initConfig({
        uglify: {
            my_target: {
                files: {
                    'dest/output.min.js': ['src/input1.js', 'src/input2.js']
                }
            }
        },
        protractor: {
//            options: {
//                configFile: "referenceConf.js", // Default config file
//                keepAlive: false, // If false, the grunt process stops when the test fails.
//                noColor: false, // If true, protractor will not use colors in its output.
//                args: {
//                    // Arguments passed to the command
//                }
//            },
            your_target: {
                options: {
                    configFile: "lmreferenceConf.js",
//                    configFile: "e2e.conf.js", // Target-specific config file
                    args: {}
//                    args: {specs=["spec1.js","spec2.js"]} // Target-specific arguments
                }
            }
        }
    })
};