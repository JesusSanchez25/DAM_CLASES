import fiftyone as fo


dataset1 = fo.zoo.load_zoo_dataset(
              "open-images-v6", 
              split="validation",
              label_types=["detections"],
              classes=["Cat", "Dog"],
              max_samples=100,
          )
print(fo.list_datasets)
session = fo.launch_app(dataset1, port=5151)

session.wait()
