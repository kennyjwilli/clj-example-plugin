#!/usr/bin/env bash

set -euo pipefail

jarName="clj-example-plugin.jar"

clojure -A:dev -m build.compile
clojure -Spom
echo "writing jar to ${jarName}"
clojure -A:jar ${jarName}
echo "success!"